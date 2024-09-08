package Controller;

import Model.Entity.Animal;
import Repository.Island;
import Service.AnimalService;
import Service.ReproductionService;

public class ReproductionThread  implements Runnable{

    Island island;

    AnimalService service = new AnimalService();
    ReproductionService reproductionService = new ReproductionService(island);

    public ReproductionThread(Island island) {
        this.island = island;
    }
    // TODO написать логику проверки соседней ячейки чтоб там было идентичное животное

    @Override
    public void run() {
        for (int i = 0; i < island.getIsland().length; i++) {
            for (int j = 0; j < island.getIsland()[0].length; j++) {
                if (island.getIsland()[i][j] instanceof Animal && island.getIsland()[i+1][j+1] instanceof Animal) {
                    Animal animal1 = (Animal) island.getIsland()[i][j];
                    Animal animal2 = (Animal) island.getIsland()[i+1][j+1];

                    try {
                        reproductionService.reproduction(island.findFreeIndex(), animal1, animal2);
                    } catch (InstantiationException e) {
                        throw new RuntimeException(e);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println();

                    System.out.println();

                }
            }
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

