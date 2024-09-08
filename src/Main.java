import Controller.GameThread;
import Controller.ReproductionThread;
import Model.Entity.Animal;
import Model.Entity.AnimalData;
import Model.Entity.Bear;
import Repository.Island;
import Service.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, ParserConfigurationException, IOException, SAXException {
        AnimalData animalData= new AnimalData();
     XMLFactory xmlFactory = new XMLFactory();
     FileReaderService fileReaderService = new FileReaderService();
     fileReaderService.parse("C:\\Users\\modar\\OneDrive\\Рабочий стол\\animals.xml");
       System.out.println(animalData.getType());
        System.out.println(fileReaderService.getType() + " " + fileReaderService.getFoodLevel() + " " + fileReaderService.getHealth());
        System.out.println(animalData);

//        Island island = new Island(10, 10);
//             PopulationService service = new PopulationService(island);
//             service.populateIsland();
//             island.printIfo();
//             GameThread gameThread = new GameThread(island);
//             island.printEntity();
//             new Thread(gameThread).start();
//        Bear bear1 = new Bear();
//        Bear bear2 = new Bear();
//        island.addAnimal(5,5,bear1);
//        island.addAnimal(5,6,bear2);
//             ReproductionService reproductionService = new ReproductionService(island);
//        for (int i = 0; i < 5; i++) {
//
//
//            reproductionService.reproduction(island.findFreeIndex(), bear1, bear2);
//        }
//        island.printEntity();
//        Arrays.asList(island).stream().filter()
//             Controller.FoodThread foodThread = new Controller.FoodThread(island);
//             new Thread(foodThread).start();
//             Controller.ReproductionThread reproductionthread = new Controller.ReproductionThread(island);
//             new Thread(reproductionthread).start();

   }

}