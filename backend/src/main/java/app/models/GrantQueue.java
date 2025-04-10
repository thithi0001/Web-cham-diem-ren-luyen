package app.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "grant_queue")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GrantQueue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "User_id")
    private String userId;

    @Column(name = "Role_name")
    private String roleName;

    @Column(name = "Is_granted")
    private boolean isGranted;

    @Column(name = "Created_at")
    private Timestamp createdAt;
}

