package Service;

import Interfaces.CreateAnimal;
import Model.Entity.Animal;
import Model.Entity.Bunny;
import Model.Entity.Eagle;

public class EagleFactory implements CreateAnimal {
    @Override
    public Animal createAnimal(){
        return new Eagle();
    }
}
