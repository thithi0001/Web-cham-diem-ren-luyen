package app.repositories;

import app.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Students, String> {
//    @Query("SELECT s FROM students s WHERE s.Student_id LIKE %:mssv%")
//    List<Students> findByMssv(@Param("mssv") String mssv);
    Optional<Students> findByStudentId(String studentId);
}
