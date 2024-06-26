package backend.univfit.domain.coverletter.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CoverLetterObj {
    private String question;
    private String content;

    public static CoverLetterObj of(
            String question,
            String content
    ){
        return CoverLetterObj.builder()
                .question(question)
                .content(content)
                .build();
    }
}
