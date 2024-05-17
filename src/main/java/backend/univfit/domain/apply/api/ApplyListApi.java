package backend.univfit.domain.apply.api;

import backend.univfit.domain.apply.api.dto.response.ApplyListResponse;
import backend.univfit.domain.apply.application.ApplyListService;
import backend.univfit.global.ApiResponse;
import backend.univfit.global.argumentResolver.MemberInfoObject;
import backend.univfit.global.argumentResolver.customAnnotation.MemberInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/apply-list")
@RestController
public class ApplyListApi {
    private final ApplyListService applyListService;
    @GetMapping("/all")
    public ApiResponse<ApplyListResponse> getAllApplyList(@MemberInfo MemberInfoObject mio){
        return ApiResponse.onSuccess(applyListService.getAllApplyList(mio));
    }
}