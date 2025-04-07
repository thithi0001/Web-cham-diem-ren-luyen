package app.repositories;

import app.models.Criterion_point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CritPointRepository extends JpaRepository<Criterion_point, Integer> {
}
