package Service;

import Model.Entity.Animal;
import Repository.Island;

public class AnimalService {
   public void foodLevelMinus(Animal animal) {
        if (animal.getFoodLevel() > 0) {
            animal.setFoodLevel(animal.getFoodLevel()-1);
        } else if (animal.getFoodLevel() == 0) {
            animal.setHealth(0);
        }

   }

    public void eat(Island island, Animal animal) {
        if (animal.isEatable() == true) {
            animal.setFoodLevel(animal.getFoodLevel() + animal.getFoodLevel());
            animal.setHealth(0);
            island.die(animal);
        }
    }
    public Animal reproduction(Animal animal) {
        if (animal.equals(animal)) {
            return new Animal();
        }

        return new Animal();
    }
}
