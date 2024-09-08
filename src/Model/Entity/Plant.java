package Model.Entity;

import Interfaces.Eatable;
import Interfaces.Entity;

public class Plant implements Eatable, Entity {
    private int foodLevel;

    public Plant(int foodLevel) {
        this.foodLevel = foodLevel;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }
    @Override
    public boolean isEatable(){
        return true;
    }

    @Override
    public String toString() {
        return "🌱";
    }
}
