import java.lang.reflect.InvocationTargetException;
import java.util.Random;


public class PopulationService {

    AnimalFactory factory = new AnimalFactory();
    PlantFactory plantFactory = new PlantFactory();

    private  Island island;

    public PopulationService(Island island) {
       this.island = island;
    }
    AnimalService service = new AnimalService();
    // TODO тестировать движение, после питание, а после него размножение

    public void populateIsland() {
        int i = 0;
        while (i <= 16) {
            i++;
            try {
                Random random = new Random();
                Animal animal = factory.createAnimal();
                Plant plant = plantFactory.createPlant();

                int row = random.nextInt(0,island.getIsland().length);
                int col = random.nextInt(0,island.getIsland()[0].length);
                int row1 = random.nextInt(0,island.getIsland().length);
                int col1 = random.nextInt(0,island.getIsland()[0].length);
                island.addAnimal(row, col, animal);
                island.addPlant(row1, col1, plant);

               island.printEntity();
//                System.out.println(plant);
//                System.out.println(animal);


            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
