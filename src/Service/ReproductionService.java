package Service;

import Model.Entity.Animal;
import Repository.Island;

public class ReproductionService {
    Island island;

    public ReproductionService(Island island) {
        this.island = island;
    }

    public Animal reproduction(int[] freeIndex, Animal animal1, Animal animal2) throws InstantiationException, IllegalAccessException {

        if (animal1.getClass().equals(animal2.getClass())) {

            Animal newAnimal = animal1.getClass().newInstance();
            island.getIsland()[freeIndex[0]][freeIndex[1]] = newAnimal;
            return newAnimal;


        }
        return null;
    }
}