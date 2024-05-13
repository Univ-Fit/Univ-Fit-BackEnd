package backend.univfit.domain.document.entity;

import backend.univfit.domain.apply.entity.AnnouncementEntity;
import backend.univfit.domain.document.enums.RequiredOptions;
import backend.univfit.global.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "require_document")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RequireDocumentEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentName;

    @Enumerated(EnumType.STRING)
    private RequiredOptions requiredOptions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apply_announcement_document")
    private AnnouncementEntity announcementEntity;
}