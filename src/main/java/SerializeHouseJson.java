import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;

public class SerializeHouseJson {

    private static final ObjectMapper mapper = new ObjectMapper();
    public static String serialize(Person person) throws IOException {
        if (person == null) {
            throw new IllegalArgumentException("Нет человека");
        }
       return mapper.writeValueAsString(person);
    }

    public static Person deserialize(String jsonString){
      try {
            return mapper.readValue(jsonString, Person.class);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }


}
