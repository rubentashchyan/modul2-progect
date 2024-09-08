package Service;

import Interfaces.CreateAnimal;
import Model.Entity.Animal;
import Model.Entity.Fox;

public class FoxFactory implements CreateAnimal {
    @Override
    public Animal createAnimal(){
        return new Fox();
    }
}
