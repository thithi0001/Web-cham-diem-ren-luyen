package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detail_point")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Detail_point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tu dong gia tang
    @Column(name = "Detail_point_id")
    private Integer detailPointId;

    @JoinColumn(name = "Detail_id")
    private Details detail;

    @JoinColumn(name = "Crit_point_id")
    private Criterion_point critPoint;

    @Column(name = "Student_point", columnDefinition = "Integer default 0")
    private Integer studentPoint = 0;

    @Column(name = "BCS_point", columnDefinition = "Integer default 0")
    private Integer bcsPoint = 0;

    @Column(name = "Advisor_point", columnDefinition = "Integer default 0")
    private Integer advisorPoint = 0;
}
