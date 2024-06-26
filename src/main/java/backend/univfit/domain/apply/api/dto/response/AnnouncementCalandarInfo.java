package backend.univfit.domain.apply.api.dto.response;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AnnouncementCalandarInfo {
    private Long applyId;
    private LocalDate endDocumentDate;
    private String announcementImageUrl;
    private String scholarShipName;
    private String scholarShipFoundation;
    private String applicationPeriod;

    public static AnnouncementCalandarInfo of(
            Long applyId,
            LocalDate endDocumentDate,
            String announcementImageUrl,
            String scholarShipName,
            String scholarShipFoundation,
            String applicationPeriod
    ){
        return AnnouncementCalandarInfo.builder()
                .applyId(applyId)
                .endDocumentDate(endDocumentDate)
                .announcementImageUrl(announcementImageUrl)
                .scholarShipName(scholarShipName)
                .scholarShipFoundation(scholarShipFoundation)
                .applicationPeriod(applicationPeriod)
                .build();
    }
}
