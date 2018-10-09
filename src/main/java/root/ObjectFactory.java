package root;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private final static QName Q_NAME= new QName(XMLConstants.NULL_NS_URI, "datd");

    @XmlElementDecl(name="dataObject")
    public JAXBElement<DataObject> createData(DataObject value){
        return new JAXBElement<DataObject>(Q_NAME, DataObject.class, null, value);
    }
}
