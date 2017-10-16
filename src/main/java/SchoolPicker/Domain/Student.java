package SchoolPicker.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
/**
 * Created by Kino on 2017-08-07.
 */
@Entity
public class Student implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String age;
    private String gender;
    private String grade;
    private String focusArea;

    public Student()
    {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getFocusArea() {
        return focusArea;
    }

    public void setFocusArea(String focusArea) {
        this.focusArea = focusArea;
    }

    public Long getStudentID() {
        return id;
    }

    public void setStudenID(Long studenID) {
        this.id = studenID;
    }

    private Student(Builder builder)
    {
        this.id = builder.studentID;
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.gender = builder.gender;
        this.grade = builder.grade;
        this.focusArea = builder.focusArea;

    }


    public static class Builder
    {
        private String name, surname, age, gender, grade, focusArea;
        private Long studentID;

        public Builder name(String n)
        {
            this.name = n;
            return this;
        }

        public Builder studentID(Long n)
        {
            this.studentID = n;
            return this;
        }

        public Builder surname(String sn)
        {
            this.surname = sn;
            return this;
        }

        public Builder age(String a)
        {
            this.age = a;
            return this;
        }

        public Builder gender(String g)
        {
            this.gender = g;
            return this;
        }

        public Builder grade(String g)
        {
            this.grade = g;
            return this;
        }

        public Builder focusArea(String f)
        {
            this.focusArea = f;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
