import java.lang.reflect.InvocationTargetException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
       Island island = new Island(20, 20);

             AnimalThread thread = new AnimalThread(island);
             thread.run();
             FoodThread foodThread = new FoodThread(island);
             foodThread.run();
   }

}