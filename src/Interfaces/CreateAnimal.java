package Interfaces;

import Model.Entity.Animal;

public interface CreateAnimal {
    public default Animal createAnimal(){
        return new Animal();
    }
}
