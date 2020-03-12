package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "course")
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
    // additional properties

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        if (getId() != null ? !getId().equals(course.getId()) : course.getId() != null) return false;
        if (getName() != null ? !getName().equals(course.getName()) : course.getName() != null) return false;
        if (getLikes() != null ? !getLikes().equals(course.getLikes()) : course.getLikes() != null) return false;
        return getRegistrations() != null ? getRegistrations().equals(course.getRegistrations()) : course.getRegistrations() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getLikes() != null ? getLikes().hashCode() : 0);
        result = 31 * result + (getRegistrations() != null ? getRegistrations().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", likes=" + likes +
                ", registrations=" + registrations +
                '}';
    }

    public Course() {
    }

    public Long getId() {
        return id;
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

    public Set<Student> getLikes() {
        return likes;
    }

    public void setLikes(Set<Student> likes) {
        this.likes = likes;
    }

    public void setRegistrations(Set<CourseRegistration> registrations) {
        this.registrations = registrations;
    }

    public Set<CourseRegistration> getRegistrations() {
        return registrations;
    }

}
