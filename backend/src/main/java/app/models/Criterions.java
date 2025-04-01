package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "criterions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Criterions {
    @Id
    @Column(name = "Crit_id")
    private String critId;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "Max_point", nullable = false)
    private Integer maxPoint;
}
