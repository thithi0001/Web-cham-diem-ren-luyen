package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "form_criterion",
        uniqueConstraints = @UniqueConstraint(columnNames = {"Sample_id", "Crit_id"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Form_Criterion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Form_crit_id")
    private Integer formCritId;

    @ManyToOne
    @JoinColumn(name = "Sample_id")
    private Sample_form sample;

    @ManyToOne
    @JoinColumn(name = "Crit_id")
    private Criterions criterion;

    @Column(name = "Order", nullable = false)
    private int Order;
}
