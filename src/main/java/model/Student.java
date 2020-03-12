package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "course_registration", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> likedCourses;


    @OneToMany(mappedBy = "student")
    private Set<CourseRegistration> registrations;


    // additional properties

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getId() != null ? !getId().equals(student.getId()) : student.getId() != null) return false;
        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        if (getLikedCourses() != null ? !getLikedCourses().equals(student.getLikedCourses()) : student.getLikedCourses() != null)
            return false;
        return getRegistrations() != null ? getRegistrations().equals(student.getRegistrations()) : student.getRegistrations() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getLikedCourses() != null ? getLikedCourses().hashCode() : 0);
        result = 31 * result + (getRegistrations() != null ? getRegistrations().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", likedCourses=" + likedCourses +
                ", registrations=" + registrations +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Set<Course> getLikedCourses() {
        return likedCourses;
    }


    public Set<CourseRegistration> getRegistrations() {
        return registrations;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLikedCourses(Set<Course> likedCourses) {
        this.likedCourses = likedCourses;
    }

    public void setRegistrations(Set<CourseRegistration> registrations) {
        this.registrations = registrations;
    }

}
