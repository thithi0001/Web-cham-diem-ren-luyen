package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "reports",
        uniqueConstraints = @UniqueConstraint(columnNames = {"Class_id", "Sem_id"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Report_id")
    private Integer reportId;

    @ManyToOne
    @JoinColumn(name = "Class_id")
    private Classes aClass;

    @ManyToOne
    @JoinColumn(name = "Sem_id")
    private Semesters semester;

    @Column(name = "File_url", nullable = false)
    private String fileUrl;
}
