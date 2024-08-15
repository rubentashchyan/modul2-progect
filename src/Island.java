import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Random;


public class Island {

    private Entity[][] island;
    private AnimalFactory factory = new AnimalFactory();

    public Entity[][] getIsland() {
        return island;
    }

    public Island(int row, int col) {
        island = new Entity[row][col];
    }

    public void generateAnimals(int quantity) throws InvocationTargetException, NoSuchMethodException
            , InstantiationException, IllegalAccessException {
        if(quantity <= 0){
            throw new IllegalArgumentException(" количество животных должно быть больше 0");
        }
        if (quantity > island.length * island[0].length){
            throw new IllegalArgumentException("недопустимая величина");
        }
        for (int i = 0; i < quantity; i++) {
            Random random = new Random();
            int r = random.nextInt(island.length);
            int c = random.nextInt(island[0].length);
            if (island[r][c] == null){
              addAnimal(r, c, factory.createAnimal() ) ;
            }
        }

    }



    public void addAnimal(int row, int col, Animal animal) {
        island[row][col] = animal;
    }
    public void addPlant (int row, int col, Plant plant) {
        if (island[row][col] == null){
            island[row][col] = plant;
        }
    }

    public  int[] findAnimal(Animal animal) {
        for (int row = 0; row < island.length; row++) {
            for (int col = 0; col < island.length; col++) {
                if (island[row][col] == animal) {
                    return new int[] { row, col };
                }
            }
        }

        return null;
    }

   public  void deleteAnimal(Animal animal){

       int[] coordinates = findAnimal(animal);
       if (coordinates != null ) {
           int row = coordinates[0];
           int col = coordinates[1];
           island[row][col] = null;
        }
    }
    public  void die (Animal animal){
        if(animal.getHealth() == 0){
           deleteAnimal(animal);
        }
    }
    public void printIfo() {

        System.out.println(Arrays.stream(island).findAny());
    }
    public void printEntity(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island.length; j++) {

                System.out.print(island[i][j] + " ");
            }
            System.out.println();
        }

    }
    public void printOnlyAnimals(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island.length; j++) {
               if(island[i][j] != null)
                System.out.print(island[i][j] + " ");
            }
        }

    }
    public void move(Animal animal) {
        Random random = new Random();
        int[] coordinates = findAnimal(animal);
        if (coordinates != null ) {
            int row = coordinates[0];
            int col = coordinates[1];
            int offsetRow = random.nextInt(-1, 2);
            int offsetCol = random.nextInt(-1, 2);
            island[offsetRow][offsetCol] =  animal ;
            island[row][col] = null;
    }

   }

}
