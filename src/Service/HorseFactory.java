package Service;

import Interfaces.CreateAnimal;
import Model.Entity.Animal;
import Model.Entity.Horse;

public class HorseFactory implements CreateAnimal {
    @Override
    public Animal createAnimal(){
        return new Horse();
    }

}
