package Model.Entity;

public class Bunny extends Herbivore {
    public Bunny(int foodLevel, int health) {
        super(15, 15);
    }

    public Bunny(){
        super(15,15);
    }

 @Override
    public  String toString(){
        return "🐇";
 }
}
