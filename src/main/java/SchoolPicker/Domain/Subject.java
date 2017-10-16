package SchoolPicker.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Kino on 2017-08-09.
 */
@Entity
public class Subject implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subjectName;
    private String subjectDescription;
    private String gradOffered;
    private String aboutSubject;

    public Subject()
    {}

    public Long getSubjectId() {
        return id;
    }

    public void setSubjectId(Long subjectId) {
        this.id = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public String getGradOffered() {
        return gradOffered;
    }

    public void setGradOffered(String gradOffered) {
        this.gradOffered = gradOffered;
    }

    public String getAboutSubject() {
        return aboutSubject;
    }

    public void setAboutSubject(String aboutSubject) {
        this.aboutSubject = aboutSubject;
    }

    private Subject(Builder builder)
    {
        this.id = builder.subjectId;
        this.subjectName = builder.subjectName;
        this.subjectDescription = builder.subjectDescription;
        this.gradOffered = builder.gradOffered;
        this.aboutSubject = builder.aboutSubject;
    }

    public static class Builder
    {
        private String subjectName, subjectDescription, gradOffered, aboutSubject;
        private Long subjectId;

        public Builder subjectId(Long id)
        {
            this.subjectId = id;
            return this;
        }

        public Builder subjectName(String n)
        {
            this.subjectName = n;
            return this;
        }

        public Builder subjectDescription(String d)
        {
            this.subjectDescription = d;
            return this;
        }

        public Builder gradOffered(String g)
        {
            this.gradOffered = g;
            return this;
        }

        public Builder aboutSubject(String a)
        {
            this.aboutSubject = a;
            return this;
        }

        public Subject build()
        {
            return new Subject(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        return id.equals(subject.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
