package app.repositories;

import app.models.Detail_point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailPointRepository extends JpaRepository<Detail_point, Integer> {
}
