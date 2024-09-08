package Service;

import Interfaces.CreateAnimal;
import Model.Entity.Animal;
import Model.Entity.Mouse;

public class MouseFactory implements CreateAnimal {
    @Override
    public Animal createAnimal(){
        return new Mouse();
    }
}
