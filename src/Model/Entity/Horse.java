package Model.Entity;

public class Horse extends Herbivore {
    public Horse(int foodLevel, int health) {
        super(80, 80);
    }
    public Horse(){
        this(80,80);
    }

    @Override
    public  String toString(){
        return "🐎";
    }
}
