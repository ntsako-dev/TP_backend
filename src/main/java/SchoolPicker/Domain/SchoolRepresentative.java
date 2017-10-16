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
public class SchoolRepresentative implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String school;
    private String jobType;


    public SchoolRepresentative()
    {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSchool() {
        return school;
    }

    public String getJobType() {
        return jobType;
    }

    public Long getRepid() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void setRepid(Long repid) {
        this.id = repid;
    }



    private SchoolRepresentative(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.school = builder.school;
        this.jobType = builder.jobType;


    }


    public static class Builder
    {
        private String name, surname, school, jobType;
        private Long id;

        public Builder name(String n)
        {
            this.name = n;
            return this;
        }

        public Builder surname(String sn)
        {
            this.surname = sn;
            return this;
        }

        public Builder school(String s)
        {
            this.school = s;
            return this;
        }

        public Builder jobType(String j)
        {
            this.jobType = j;
            return this;
        }

        public Builder repid(Long r)
        {
            this.id = r;
            return this;
        }

        public SchoolRepresentative build()
        {
            return new SchoolRepresentative(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchoolRepresentative schoolRepresentative = (SchoolRepresentative) o;

        return id.equals(schoolRepresentative.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
