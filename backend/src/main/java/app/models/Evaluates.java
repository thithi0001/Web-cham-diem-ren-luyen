package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "evaluates",
        uniqueConstraints = @UniqueConstraint(columnNames = {"Student_id", "Sem_id"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Evaluates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Evaluate_id")
    private Integer evaluateId;

    @ManyToOne
    @JoinColumn(name = "Student_id")
    private Students student;

    @ManyToOne
    @JoinColumn(name = "Sem_id")
    private Semesters semester;

    @Enumerated(EnumType.STRING)
    @Column(name = "Rating")
    private Rating rating;

    @Column(name = "Student_total_point", columnDefinition = "int default 0")
    private int studentTotalPoint = 0;

    @Column(name = "BCS_total_point", columnDefinition = "int default 0")
    private int bcsTotalPoint = 0;

    @Column(name = "Advisor_total_point", columnDefinition = "int default 0")
    private int advisorTotalPoint = 0;

    @ManyToOne
    @JoinColumn(name = "Sample_id")
    private Sample_form sample;

    @Enumerated(EnumType.STRING)
    @Column(name = "Student_status", columnDefinition = "varchar(20) default Processing")
    private EvaluateStatus studentStatus = EvaluateStatus.Processing;

    @Enumerated(EnumType.STRING)
    @Column(name = "BCS_status", columnDefinition = "varchar(20) default Processing")
    private EvaluateStatus bcsStatus = EvaluateStatus.Processing;

    @Enumerated(EnumType.STRING)
    @Column(name = "Advisor_status", columnDefinition = "varchar(20) default Processing")
    private EvaluateStatus advisorStatus = EvaluateStatus.Processing;
}
