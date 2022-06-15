import java.io.*;

public class SerializeHouse {

    public void houseSerialize(House house, OutputStream file) {
            try (ObjectOutput out = new ObjectOutputStream(file)) {
                out.writeObject(house);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public House houseDeserialize(InputStream file) {
            try (ObjectInputStream in = new ObjectInputStream(file)) {
                return (House) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
    }
}
