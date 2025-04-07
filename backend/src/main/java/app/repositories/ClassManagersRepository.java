package app.repositories;

import app.models.ClassManagersId;
import app.models.Class_managers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassManagersRepository extends JpaRepository<Class_managers, ClassManagersId> {
}
