package root;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name="dataObject")
public class DataObject extends NonSerializable implements Serializable {
    String s = "str";
    @XmlElement
    int i = 5;
    transient String[] def;
    CustomObject obj = new CustomObject();
}
