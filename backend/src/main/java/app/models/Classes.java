package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "classes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Classes {
    @Id
    @Column(name = "Class_id")
    private String classId;

    @ManyToOne
    @JoinColumn(name = "Dept_id")
    private Departments department;

    @Column(name = "Class_name", nullable = false, unique = true)
    private String className;

    @Column(name = "Num_of_students", nullable = false)
    private Integer numOfStudents;

    @Column(name = "Current_num_of_students", nullable = false)
    private Integer currentNumOfStudents;
}