import java.io.*;
import java.io.IOException;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SerializeTests {
    @Test
    public void serializeHouseTest() throws IOException {
        final String file = "C:\\Users\\Asus\\IdeaProjects\\VvodAndSerial\\test_s.json";
        List<Person> persons = List.of(
                new Person("Асаевич", "Никита", "Сергеевич", 23, 2, 2003),
                new Person("Кутина", "Ирина", "Андреевна", 17, 5, 2002)
        );
        List<Flat> flats = List.of(new Flat(50, 40, persons));
        Person human = new Person("Асаевич", "Никита", "Сергеевич", 23, 2, 2003);
        House house = new House("123456", "проспект Мира 106", human, flats);
        FileOutputStream file1 = new FileOutputStream(file);
        SerializeHouse s = new SerializeHouse();
        s.houseSerialize(house, file1);

        FileInputStream file2 = new FileInputStream(file);
            House houseTest = s.houseDeserialize(file2);
            assertEquals(houseTest, house);
    }
}
