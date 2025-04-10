package app.models;

import app.embedded_id.StudentClassId;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "student_class")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student_Class {
    @EmbeddedId
    private StudentClassId id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "Student_id", nullable = false)
    private Students student;

    @ManyToOne
    @MapsId("classId")
    @JoinColumn(name = "Class_id", nullable = false)
    private Classes aClass;

    @Column(name = "Start_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "End_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
}
