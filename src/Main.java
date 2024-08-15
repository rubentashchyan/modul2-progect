import java.lang.reflect.InvocationTargetException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
       Island island = new Island(10, 10);


             FoodThread foodThread = new FoodThread(island);
             new Thread(foodThread).start();
             ReproductionThread reproductionthread = new ReproductionThread(island);
             new Thread(reproductionthread).start();

   }

}