package Service;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import Model.Entity.*;

public class AnimalFactory {
    BearFactory bearFactory = new BearFactory();
    BunnyFackory bunnyFackory = new BunnyFackory();
    EagleFactory eagleFactory = new EagleFactory();
    FoxFactory foxFactory = new FoxFactory();
    HorseFactory horseFactory = new HorseFactory();
    MouseFactory mouseFactory = new MouseFactory();
    SheepFactory sheepFactory= new SheepFactory();
    WolfFactory wolfFactory = new WolfFactory();
    public Animal createAnimal() throws NoSuchMethodException, InvocationTargetException
            , InstantiationException, IllegalAccessException {
        Random random = new Random();

        Class<?>[] animalclasses = new Class[]{Bear.class, Eagle.class, Bunny.class, Fox.class,
                Horse.class, Mouse.class, Sheep.class, Wolf.class};

        int index = random.nextInt(animalclasses.length);
        return (Animal) animalclasses[index].getConstructor().newInstance();
    }

    public void createAllAnimals(){
      bearFactory.createAnimal();
      bunnyFackory.createAnimal();
      eagleFactory.createAnimal();
      foxFactory.createAnimal();
      horseFactory.createAnimal();
      mouseFactory.createAnimal();
      sheepFactory.createAnimal();
      wolfFactory.createAnimal();
    }

}
