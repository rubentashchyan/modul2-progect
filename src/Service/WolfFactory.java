package Service;

import Interfaces.CreateAnimal;
import Model.Entity.Animal;
import Model.Entity.Wolf;

public class WolfFactory implements CreateAnimal {
    @Override
    public Animal createAnimal(){
    return new Wolf();
}

}
