package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "course")
@Data
@EqualsAndHashCode
public class Course {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "likedCourses")
    private Set<Student> likes;

    @OneToMany(mappedBy = "course")
    private Set<CourseRegistration> registrations;

    public Course() {
    }
}
