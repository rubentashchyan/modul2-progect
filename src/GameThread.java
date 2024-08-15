public class GameThread implements Runnable {
    Island island = new Island(100, 100);
    AnimalFactory factory = new AnimalFactory();
    PlantFactory plantFactory = new PlantFactory();


    public GameThread(Island island) {
        this.island = island;
    }

    @Override
    public void run() {

        while (true) {
            for (int i = 0; i < island.getIsland().length; i++) {
                for (int j = 0; j < island.getIsland()[0].length; j++) {
                    Animal animal = (Animal) island.getIsland()[i][j];

                    island.move(animal);

                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }
    }
}