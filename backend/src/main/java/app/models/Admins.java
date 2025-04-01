package app.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "admins")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Admins {
    @Id
    @Column(name = "Admin_id")
    private String adminId;

    @OneToOne
    @JoinColumn(name = "User_id")
    private Users user;

    @Column(name = "Full_name", nullable = false)
    private String fullName;

    @Column(name = "Bdate", nullable = false)
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "Gender", nullable = false)
    private Gender gender;

    @Column(name = "Email", unique = true, nullable = false)
    private String email;

    @Column(name = "Phone", unique = true, nullable = false, length = 10)
    private String phone;

    @Column(name = "Is_active", columnDefinition = "boolean default true")
    private Boolean isActive = true;
}
