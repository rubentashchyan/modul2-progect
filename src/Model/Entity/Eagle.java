package Model.Entity;

public class Eagle extends Predator {
    public Eagle(int foodLevel, int health) {
        super(40, 40);
    }

    @Override
    public Animal reproduction(Animal animal) {
        return new Eagle();
    }


    public Eagle(){
        super(40,40);
    }

    @Override
    public  String toString(){
        return "🦅";
    }

}
