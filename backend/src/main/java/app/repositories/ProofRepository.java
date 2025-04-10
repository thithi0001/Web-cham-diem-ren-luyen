package app.repositories;

import app.enums.ProofStatus;
import app.models.Proofs;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ProofRepository extends JpaRepository<Proofs, Integer> {
    List<Proofs> findByStatus(ProofStatus status);
}
