package za.ac.cputweek.domain;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Location {

    @Id
    private String id;
    private String name;
    private String address;
    private int sizeStreets;

    public Location()
    {

    }

    public Location(String id, String name, String address, int sizeStreets) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.sizeStreets = sizeStreets;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSizeStreets() {
        return sizeStreets;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSizeStreets(int sizeStreets) {
        this.sizeStreets = sizeStreets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return id.equals(location.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
