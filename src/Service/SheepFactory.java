package Service;

import Interfaces.CreateAnimal;
import Model.Entity.Animal;
import Model.Entity.Sheep;

public class SheepFactory implements CreateAnimal {
    @Override
    public Animal createAnimal(){
        return new Sheep();
    }
}
