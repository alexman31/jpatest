package model;

import javax.persistence.*;

@Entity
@Table(name = "course_registration")
public class CourseRegistration {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public CourseRegistration() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseRegistration)) return false;

        CourseRegistration that = (CourseRegistration) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getStudent() != null ? !getStudent().equals(that.getStudent()) : that.getStudent() != null) return false;
        return getCourse() != null ? getCourse().equals(that.getCourse()) : that.getCourse() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getStudent() != null ? getStudent().hashCode() : 0);
        result = 31 * result + (getCourse() != null ? getCourse().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CourseRegistration{" +
                "id=" + id +
                ", student=" + student +
                ", course=" + course +
                '}';
    }

}
