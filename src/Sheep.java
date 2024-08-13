public class Sheep extends Herbivore{
    public Sheep(int foodLevel, int health) {
        super(40, 40);
    }
    public Sheep(){
        this(40,40);
    }

    @Override
    public  String toString(){
        return "🐑";
    }
}
