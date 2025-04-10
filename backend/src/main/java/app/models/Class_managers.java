package app.models;

import app.embedded_id.ClassManagersId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "class_managers")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Class_managers {
    @EmbeddedId
    private ClassManagersId id;

    @ManyToOne
    @MapsId("classId")
    @JoinColumn(name = "Class_id")
    private Classes aClass;

    @ManyToOne
    @MapsId("semId")
    @JoinColumn(name = "Sem_id")
    private Semesters semester;

    @ManyToOne
    @JoinColumn(name = "Instructor_id")
    @Column(name = "Advisor_id")
    private Instructors advisor;

    @ManyToOne
    @JoinColumn(name = "Student_id")
    @Column(name = "LT_id")
    private Students lt;

    @ManyToOne
    @JoinColumn(name = "Student_id")
    @Column(name = "LP_id")
    private Students lp;
}
