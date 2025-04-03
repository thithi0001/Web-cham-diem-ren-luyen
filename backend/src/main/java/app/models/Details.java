package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Details {
    @Id
    @Column(name = "Detail_id")
    private String detailId;

    @ManyToOne
    @JoinColumn(name = "Crit_id")
    private Criterions criterion;

    @Column(name = "Order", nullable = false)
    private int order;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "Max_point", nullable = false)
    private int maxPoint;

    @Column(name = "Is_proof_needed", nullable = false)
    private boolean isProofNeeded;
}
