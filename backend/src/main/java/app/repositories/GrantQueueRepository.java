package app.repositories;

import app.models.GrantQueue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GrantQueueRepository extends JpaRepository<GrantQueue, Long> {
    List<GrantQueue> findByIsGrantedFalse();
}

