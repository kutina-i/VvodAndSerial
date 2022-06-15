import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable{

private String Surname;
private String Name;
private String Patronymic;
private int Day;
private int Month;
private int Year;

        public Person(String Surname, String Name, String Patronymic, int Day, int Month, int Year) {

            this.Surname = Surname;
            this.Name = Name;
            this.Patronymic = Patronymic;
            if(Year < 1){
                throw new IllegalArgumentException("Некорректно введен год");
            }else{
                this.Year = Year;
            }
            if(Month < 1 || Month > 12){
                throw new IllegalArgumentException("Некорректно введен месяц");
            }else{
                this.Month = Month;
            }
            if(Day < 1 || Day > 31){
                throw new IllegalArgumentException("Некорректно введен день");
            }else{
                if(Month == 4 || Month == 6 || Month == 9 || Month == 11){
                    if (Day > 30){
                        throw new IllegalArgumentException("Некорректно введен день");
                    }
                }
                if(Month == 2){
                    if(Year % 400 == 0 && Year % 100 != 0 && Year % 4 == 0){
                        if (Day > 29){
                            throw new IllegalArgumentException("Некорректно введен день");
                        }
                    }else{
                        if (Day > 28){
                            throw new IllegalArgumentException("Некорректно введен день");
                        }
                    }
                }
                this.Day = Day;
            }

        }

        public Person() {
            this.Surname = null;
            this.Name = null;
            this.Patronymic = null;
            this.Day = 1;
            this.Month = 1;
            this.Year = 1970;
        }

        public String getSurname() {
            return Surname;
        }

        public String getName() {
            return Name;
        }

        public String getPatronymic() {
            return Patronymic;
        }

        public int getDay() {
            return Day;
        }

        public int getMonth() {
            return Month;
        }

        public int getYear() {
            return Year;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Day == person.Day && Month == person.Month && Year == person.Year && Objects.equals(Surname, person.Surname) && Objects.equals(Name, person.Name) && Objects.equals(Patronymic, person.Patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Surname, Name, Patronymic, Day, Month, Year);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", Patronymic='" + Patronymic + '\'' +
                ", Day=" + Day +
                ", Mouth=" + Month +
                ", Year=" + Year +
                '}';
    }

}
