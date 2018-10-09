package root;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class Main {
    static final String PACK = (DataObject.class).getPackage().getName();

    public static void main(String[] args) throws IOException, JAXBException {

        DataObject dObj = new DataObject();
//        File file = new File("marshaling.xml");

        //------Маршалинг
//        JAXBContext jc = JAXBContext.newInstance(PACK);
//        Marshaller m = jc.createMarshaller();
//        Unmarshaller um = jc.createUnmarshaller();
//        m.marshal(dObj, file);

        //--------JSON
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(dObj);
        System.out.println(json);

        //---------Serialization
//        FileOutputStream fos = new FileOutputStream(file);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        root.DataObject dObj = new root.DataObject();
//        dObj.setMyData("asdasgfredhrgfhsdfgasdgf");
//        oos.writeObject(dObj);
//        oos.flush();
//        oos.close();
    }
}
