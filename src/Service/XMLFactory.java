package Service;

import Model.Entity.Animal;
import Model.Entity.AnimalData;
import Model.Entity.Bear;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLFactory {
FileReaderService fileReaderService;
    String animaltype;

    {
        try {
            fileReaderService = new FileReaderService();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public Animal XMLFactory(AnimalData animalData) throws IllegalArgumentException, ParserConfigurationException, IOException, SAXException {


        switch (animalData.getType()){
            case "Bear" :{
             return new Bear();


            }
            default:
        };
       return new Animal();
    }
}