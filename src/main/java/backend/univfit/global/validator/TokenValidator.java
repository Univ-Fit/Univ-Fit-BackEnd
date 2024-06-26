package backend.univfit.global.validator;

import backend.univfit.global.error.exception.JwtException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

import static backend.univfit.global.error.status.ErrorStatus.JWT_UNSUPPORTED_TOKEN_TYPE;

@Slf4j
public class TokenValidator {
    public static String tokenValidator(ServletRequest servletRequest, ServletResponse servletResponse){
        final String BASIC_TYPE_PREFIX = "Bearer";
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final String authorization = request.getHeader("Authorization");
        log.info("authorization : " + authorization);
        final boolean isBasicAuthentication = authorization != null && authorization.toLowerCase().startsWith(BASIC_TYPE_PREFIX.toLowerCase());

        if (!isBasicAuthentication) {
            throw new JwtException(JWT_UNSUPPORTED_TOKEN_TYPE);
        }

        return authorization.substring(BASIC_TYPE_PREFIX.length()).trim();
    }
}
