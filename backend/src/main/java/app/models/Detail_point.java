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

    @ManyToOne
    @JoinColumn(name = "Detail_id")
    private Details detail;

    @ManyToOne
    @JoinColumn(name = "Crit_point_id")
    private Criterion_point critPoint;

    @Column(name = "Student_point", columnDefinition = "int default 0")
    private int studentPoint = 0;

    @Column(name = "BCS_point", columnDefinition = "int default 0")
    private int bcsPoint = 0;

    @Column(name = "Advisor_point", columnDefinition = "int default 0")
    private int advisorPoint = 0;
}
