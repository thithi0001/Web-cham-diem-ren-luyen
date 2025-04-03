package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "criterion_point")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Criterion_point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tu dong gia tang
    @Column(name = "Crit_point_id")
    private Integer critPointId;

    @ManyToOne
    @JoinColumn(name = "Crit_id")
    private Criterions criterion;

    @ManyToOne
    @JoinColumn(name = "Evaluate_id")
    private Evaluates evaluate;

    @Column(name = "Student_point", columnDefinition = "int default 0")
    private int studentPoint = 0;

    @Column(name = "BCS_point", columnDefinition = "int default 0")
    private int bcsPoint = 0;

    @Column(name = "Advisor_point", columnDefinition = "int default 0")
    private int advisorPoint = 0;
}
