import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class House implements Serializable{
private String numberOfHouse, address;
private Person human;
private List<Flat> flats;

public House(String numberOfHouse, String address, Person human, List<Flat> flats) {
      this.numberOfHouse = numberOfHouse;
      this.address = address;
      this.human = human;
      this.flats = flats;
    }

public House() {
    numberOfHouse = null;
    address = null;
    human = new Person();
    flats = new ArrayList<>();
    }

    public String getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(String numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getHuman() {
        return human;
    }

    public void setHuman(Person human) {
        this.human = human;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(numberOfHouse, house.numberOfHouse) && Objects.equals(address, house.address) && Objects.equals(human, house.human) && Objects.equals(flats, house.flats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfHouse, address, human, flats);
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfHouse='" + numberOfHouse + '\'' +
                ", address='" + address + '\'' +
                ", human=" + human +
                ", flats=" + flats +
                '}';
    }

}
