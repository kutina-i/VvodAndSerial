import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Flat implements Serializable{
private int Number;
private double S;
private List<Person> Persons;

public Flat(int number, double s, List<Person> persons)
 {
        if(number <=0 || s<=0) {
            throw new IllegalArgumentException("Введены отрицательные номер или площадь");
        }
        if(persons == null)
        {
            throw new IllegalArgumentException("Список пуст");
        }
        this.Number = number;
        this.S = s;
        this.Persons = persons;
    }

    public double getS() {
        return S;
    }

    public int getNumber() {
        return Number;
    }

    public List<Person> getPersons() {
        return Persons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return Number == flat.Number && Double.compare(flat.S, S) == 0 && Objects.equals(Persons, flat.Persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Number, S, Persons);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "Number=" + Number +
                ", S=" + S +
                ", Persons=" + Persons +
                '}';
    }

}
