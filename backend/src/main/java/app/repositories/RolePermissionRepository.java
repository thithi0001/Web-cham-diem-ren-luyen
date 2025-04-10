package app.repositories;

import app.embedded_id.RolePermissionId;
import app.models.Role_Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends JpaRepository<Role_Permission, RolePermissionId> {
}
