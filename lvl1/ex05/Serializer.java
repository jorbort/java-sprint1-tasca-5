package lvl1.ex05;

import java.io.*;

public class Serializer {

    public void Serializer() {}

    public void serializeObject(Object obj) throws IOException {
        String serialName = "object.ser";
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(serialName)
            );
            out.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object deserializeObject(String fileName)
        throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(fileName)
            );
            return in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
