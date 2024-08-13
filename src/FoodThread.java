public class FoodThread implements Runnable{
    private AnimalService service = new AnimalService();
    private Island island;
    public FoodThread(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < island.getIsland().length; i++) {
                for (int j = 0; j < island.getIsland()[0].length; j++) {
                    Entity entity = island.getIsland()[i][j];
                    if (entity instanceof Animal){
                        Animal animal = (Animal) entity;
                        service.eat(island, animal);
                        service.FoodLevelMinus(animal);
                    }

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
