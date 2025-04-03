package app.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "deadlines")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Deadlines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Deadline_id")
    private Integer deadlineId;

    @ManyToOne
    @JoinColumn(name = "Class_id")
    private Classes aClass;

    @ManyToOne
    @JoinColumn(name = "Sem_id")
    private Semesters semester;

    @ManyToOne
    @JoinColumn(name = "Role_id")
    private Roles role;

    @Temporal(TemporalType.DATE)
    @Column(name = "Start_date", nullable = false)
    private LocalDate startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "End_date", nullable = false)
    private LocalDate endDate;
}
