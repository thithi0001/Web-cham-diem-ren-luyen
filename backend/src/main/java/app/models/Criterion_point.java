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

    @JoinColumn(name = "Crit_id")
    private Criterions criterion;

    @JoinColumn(name = "Evaluate_id")
    private Evaluates evaluate;

    @Column(name = "Student_point", columnDefinition = "Integer default 0")
    private Integer studentPoint = 0;

    @Column(name = "BCS_point", columnDefinition = "Integer default 0")
    private Integer bcsPoint = 0;

    @Column(name = "Advisor_point", columnDefinition = "Integer default 0")
    private Integer advisorPoint = 0;
}
