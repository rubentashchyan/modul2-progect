package Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.Entity.AnimalData;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
public class FileReaderService {
    private String type;
    private int foodLevel;
    private int health;

    public FileReaderService(String type, int foodLevel, int health) {
        this.type = type;
        this.foodLevel = foodLevel;
        this.health = health;
    }
    public String getType() {
        return type;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public int getHealth() {
        return health;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    AnimalData animalData = new AnimalData();
    public AnimalData parse(String pathFile) throws ParserConfigurationException, IOException, SAXException {
    File file = new File(pathFile);
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        NodeList nodeList = document.getDocumentElement().getElementsByTagName("animal");
        System.out.println(nodeList);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node animalNode = nodeList.item(i);
            if (animalNode.getNodeType() == Node.ELEMENT_NODE){
                Element animalElement = (Element)animalNode;
                setType( animalElement.getAttribute("type"));
                setFoodLevel (Integer.parseInt(animalElement.getElementsByTagName("foodlevel").item(0).getTextContent()));
                setHealth (Integer.parseInt(animalElement.getElementsByTagName("health").item(0).getTextContent()));
            }
        }
        animalData.setType(getType());
        animalData.setFoodLevel(getFoodLevel());
        animalData.setHealth(getHealth());
        return new AnimalData(type, foodLevel, health);
    }

     public FileReaderService() throws ParserConfigurationException, IOException, SAXException {
    }
}