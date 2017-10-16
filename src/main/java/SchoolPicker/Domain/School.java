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
public class School implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long schoolId;



    private String schoolName;
    private String schoolType;
    private String country;
    private String province;
    private String contact;
    private String email;
    private String gradeOffered;

    public School()
    {

    }

    public Long getSchoolId() {
        return schoolId;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getGradeOffered() {
        return gradeOffered;
    }

    public String getSchoolName() { return schoolName; }



    public void setSchoolName(String schoolName) {this.schoolName = schoolName; }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGradeOffered(String gradeOffered) {
        this.gradeOffered = gradeOffered;
    }



    private School(Builder builder)
    {
        this.schoolId = builder.schoolId;
        this.schoolName = builder.schoolName;
        this.schoolType = builder.schoolType;
        this.country = builder.country;
        this.province = builder.province;
        this.contact = builder.contact;
        this.email = builder.email;
        this.gradeOffered = builder.gradeOffered;
    }

    public static class Builder
    {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Long schoolId;
        private String  schoolName, schoolType, country, province, contact, email, gradeOffered;

        public Builder schoolId(Long id)
        {
            this.schoolId = id;
            return this;
        }

        public Builder schoolName(String name)
        {
            this.schoolName = name;
            return this;
        }


        public Builder schoolType(String type)
        {
            this.schoolType = type;
            return this;
        }

        public Builder country(String c)
        {
            this.country = c;
            return this;
        }

        public Builder province(String p)
        {
            this.province = p;
            return this;
        }

        public Builder contact(String c)
        {
            this.contact = c;
            return this;
        }

        public Builder email(String e)
        {
            this.email = e;
            return this;
        }

        public Builder gradeOffered(String g)
        {
            this.gradeOffered = g;
            return this;
        }

        public School build()
        {
            return new School(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School person = (School) o;

        return schoolId.equals(person.schoolId);
    }

    @Override
    public int hashCode() {
        return schoolId.hashCode();
    }


}
