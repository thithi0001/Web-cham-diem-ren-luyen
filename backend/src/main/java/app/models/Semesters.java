package app.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "semesters")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Semesters {
    @Id
    @Column(name = "Semester_id")
    private String semId;

    @Column(name = "School_year", nullable = false)
    private String schoolYear;

    @Column(name = "Semester", nullable = false)
    private int semester;

    @Temporal(TemporalType.DATE)
    @Column(name = "Start_date", nullable = false)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "End_date", nullable = false)
    private Date endDate;
}
