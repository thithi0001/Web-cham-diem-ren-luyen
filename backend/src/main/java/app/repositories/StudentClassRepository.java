package app.repositories;

import app.models.StudentClassId;
import app.models.Student_Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentClassRepository extends JpaRepository<Student_Class, StudentClassId> {
}
