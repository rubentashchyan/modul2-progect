package Model.Entity;

import Interfaces.Eatable;
import Model.Entity.Animal;

public class Herbivore extends Animal implements Eatable {
    public Herbivore(int foodLevel, int health) {
        super(foodLevel, health);
    }
    @Override
    public boolean isEatable(){
        return true;
    }
}
