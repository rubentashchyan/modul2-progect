package Model.Entity;

import Service.XMLFactory;

public class AnimalData {
    private String type;
    private int foodLevel;
    private int health;


    public AnimalData(String type, int foodLevel, int health) {
        this.type = type;
        this.foodLevel = foodLevel;
        this.health = health;

    }

    public AnimalData() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    public String toString() {
        return "AnimalData{" +
                "type='" + type + '\'' +
                ", foodLevel=" + foodLevel +
                ", health=" + health +
                '}';
    }
}
