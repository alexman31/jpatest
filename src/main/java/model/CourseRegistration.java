package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "course_registration")
@Data
@EqualsAndHashCode
public class CourseRegistration {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @MapsId("student_id")
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @MapsId("course_id")
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(name = "rating")
    private int rating;

    public CourseRegistration() {
    }
}
