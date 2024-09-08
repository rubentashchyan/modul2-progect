package Controller;

import Model.Entity.Animal;
import Model.Entity.Bear;
import Repository.Island;
import Service.PlantFactory;
import Service.AnimalService;

public class GameThread implements Runnable {
    Island island = new Island(100, 100);

    PlantFactory plantFactory = new PlantFactory();


    public GameThread(Island island) {
        this.island = island;
    }

    @Override
    public void run() {

        while (true) {
            for (int i = 0; i < island.getIsland().length; i++) {
                for (int j = 0; j < island.getIsland()[0].length; j++) {
                    if (island.getIsland()[i][j] instanceof Animal) {
                        Animal animal = (Animal) island.getIsland()[i][j];

                        island.move(animal);
                    }
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