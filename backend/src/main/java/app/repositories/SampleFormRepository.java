package app.repositories;

import app.models.Sample_form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleFormRepository extends JpaRepository<Sample_form, String> {
}
