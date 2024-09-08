package Service;

import Interfaces.CreateAnimal;
import Model.Entity.Animal;
import Model.Entity.Bear;

public class BearFactory implements CreateAnimal {
    @Override
    public Animal createAnimal(){
        return new Bear();
    }
}
