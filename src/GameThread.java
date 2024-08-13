import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class GameThread implements  Runnable{
    Island island = new Island(100, 100);
    AnimalFactory factory= new AnimalFactory();
    PlantFactory plantFactory = new PlantFactory();


    public GameThread(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        int i = 1;
        while (i <=16){
            i++;
            try {
                Random random = new Random();
                int row = random.nextInt(100);
                int col = random.nextInt(100);
                island.addAnimal(row, col,factory.createAnimal());
                island.addPlant(row, col, plantFactory.createPlant());
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }



      // TODO написать движение, написать второй поток где они едят, двигаются и размножаются и третий поток который печатает информацию
    }
}
