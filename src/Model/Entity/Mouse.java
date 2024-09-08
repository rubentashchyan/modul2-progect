package Model.Entity;

public class Mouse extends Herbivore {
    public Mouse(int foodLevel, int health) {
        super(10, 10);
    }
    public Mouse(){
        this(10,10);
    }

    @Override
    public  String toString(){
        return "🐭";
    }
}
