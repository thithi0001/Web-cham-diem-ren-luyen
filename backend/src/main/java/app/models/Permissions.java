package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Permission_id")
    private Integer permissionId;

    @Column(name = "Permission_name", nullable = false)
    private String permissionName;

    @Column(name = "Description", nullable = false)
    private String description;
}
