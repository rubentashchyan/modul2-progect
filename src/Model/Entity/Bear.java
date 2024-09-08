package Model.Entity;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import Repository.Island;

public class Bear extends Predator {
    public Bear(int foodLevel, int health) {
        super(foodLevel, health);

    }

    public Bear(){
        this(120,120);
    }

    @Override
    public void setFoodLevel(int foodLevel) {
        this.setFoodLevel(foodLevel);
    }
    @Override
    public void setHealth(int health) {
        this.setHealth(health);
    }


      @Override
    public String toString() {
        return "🐻" ;
    }


}