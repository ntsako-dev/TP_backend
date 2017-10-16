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
public class SchoolLocation implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locationId;
    private String province;
    private String country;
    private String unit;
    private String street;
    private String area;
    private String areacode;


    public SchoolLocation()
    {}

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    private SchoolLocation(Builder builder)
    {
        this.locationId = builder.locationId;
        this.province = builder.province;
        this.country = builder.country;
        this.unit = builder.unit;
        this.street = builder.street;
        this.area = builder.area;
        this.areacode = builder.areacode;

    }

        public static class Builder
        {
            Long locationId;
            private String  province, country, unit, street, area, areacode;

            public Builder locationId(Long id)
            {
                this.locationId = id;
                return this;
            }

            public Builder province(String p)
            {
                this.province = p;
                return this;
            }

            public Builder country(String c)
            {
                this.country = c;
                return this;
            }

            public Builder unit(String u)
            {
                this.unit = u;
                return this;
            }

            public Builder street(String s)
            {
                this.street = s;
                return this;
            }

            public Builder area(String a)
            {
                this.area = a;
                return this;
            }

            public Builder areacode(String ac)
            {
                this.areacode = ac;
                return this;
            }

            public SchoolLocation build()
            {
                return new SchoolLocation(this);
            }

        }
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                SchoolLocation school = (SchoolLocation) o;

                return locationId.equals(school.locationId);
            }

            @Override
            public int hashCode() {
                return locationId.hashCode();
            }


    }
