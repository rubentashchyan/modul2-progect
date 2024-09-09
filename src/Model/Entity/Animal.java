package Model.Entity;

import Interfaces.Eatable;
import Interfaces.Entity;

public class Animal implements Eatable, Entity {

   private int foodLevel;
    private int health;

    public Animal(int foodLevel, int health) {
        this.foodLevel = foodLevel;
        this.health = health;
    }

    public Animal() {
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public boolean isEatable() {
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "foodLevel=" + foodLevel +
                ", health=" + health +
                '}';
    }


}
