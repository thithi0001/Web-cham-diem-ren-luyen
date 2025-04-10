package app.models;

import app.embedded_id.RolePermissionId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "role_permission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role_Permission {
    @EmbeddedId
    private RolePermissionId id;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "Role_id", nullable = false)
    private Roles role;

    @ManyToOne
    @MapsId("permissionId")
    @JoinColumn(name = "Permission_id", nullable = false)
    private Permissions permission;
}
