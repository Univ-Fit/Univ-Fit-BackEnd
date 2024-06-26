package backend.univfit.domain.document.repository;

import backend.univfit.domain.document.entity.DocumentEntity;
import backend.univfit.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DocumentJpaRepository extends JpaRepository<DocumentEntity, Long> {
    Optional<DocumentEntity> findByDocumentNameAndMember(String documentName, Member member);
    Optional<DocumentEntity> findByDocumentName(String documentName);
    List<DocumentEntity> findByMember(Member member);
    Optional<DocumentEntity> findByIdAndMember(Long documentId,Member member);

}
