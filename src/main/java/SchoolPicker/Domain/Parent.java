package SchoolPicker.Domain;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
/**
 * Created by Kino on 2017-08-07.
 */
@Entity
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Parent implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String cellphone;
    private String gender;

    public Parent()
    {

    }

    public Parent(String name, String surname, String cellphone, String gender, String pswd) {
        this.name = name;
        this.surname = surname;
        this.cellphone = cellphone;
        this.gender = gender;
        this.pswd = pswd;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    private String pswd;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getGender() {
        return gender;
    }

    public Long getIDno() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIDno(Long IDno) {
        this.id = IDno;
    }

    private Parent(Builder builder)
    {
        this.id = builder.IDno;
        this.name = builder.name;
        this.surname = builder.surname;
        this.cellphone = builder.cellphone;
        this.gender = builder.gender;
        this.pswd = builder.pass;

    }


        public static class Builder
        {
            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            Long IDno;
            private String name, surname, cellphone, gender, pass;


            public Builder nameVal(String n)
            {
                this.name = n;
                return this;
            }

            public Builder passwordVal(String p)
            {
                this.pass = p;
                return this;
            }


            public Builder surnameVal(String sn)
            {
                this.surname = sn;
                return this;
            }

            public Builder cellphone(String phone)
            {
                this.cellphone = phone;
                return this;
            }

            public Builder gender(String gen)
            {
                this.gender = gen;
                return this;
            }

            public Builder idno(Long id)
            {
                this.IDno = id;
                return this;
            }

            public Parent build()
            {
                return new Parent(this);
            }

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parent parent = (Parent) o;

        return id.equals(parent.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


}
