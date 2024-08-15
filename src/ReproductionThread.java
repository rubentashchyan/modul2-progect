public class ReproductionThread  implements Runnable{

    Island island;


    AnimalService service = new AnimalService();

    public ReproductionThread(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        for (int i = 0; i < island.getIsland().length; i++) {
            for (int j = 0; j < island.getIsland()[0].length; j++) {
                if (island.getIsland()[i][j] instanceof Animal) {
                    Animal animal = (Animal) island.getIsland()[i][j];

                    service.reproduction(animal);
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

