package Service;

import Interfaces.CreateAnimal;
import Model.Entity.Animal;
import Model.Entity.Bunny;

public class BunnyFackory implements CreateAnimal {
    @Override
    public Animal createAnimal(){
        return new Bunny();
    }
}
