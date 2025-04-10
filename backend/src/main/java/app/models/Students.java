package app.models;

import app.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Students {
    @Id
    @Column(name = "Student_id")
    private String studentId;

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

    @Column(name = "Is_graduated", columnDefinition = "boolean default false")
    private Boolean isGraduated = false;
}
