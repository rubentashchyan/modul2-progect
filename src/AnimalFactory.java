import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class AnimalFactory {

    public Bear createNewBear(){
        return new Bear(80, 120);
    }
    public void printIfo(){
        System.out.println(createNewBear());
    }
    public Bunny createNewBunny(){
        return new Bunny(10,15);
    }
    public Eagle createNewEagle(){
        return new Eagle(30,30);
    }

    public Animal createAnimal() throws NoSuchMethodException, InvocationTargetException
            , InstantiationException, IllegalAccessException {
        Random random = new Random();


        Class<?>[] animalclasses = new Class[]{Bear.class, Eagle.class, Bunny.class, Fox.class,
                Horse.class, Mouse.class, Sheep.class, Wolf.class};


        int index = random.nextInt(animalclasses.length);
        return (Animal) animalclasses[index].getConstructor().newInstance();


    }

}
