public class Fox  extends Predator{
    public Fox(int foodLevel, int health) {
        super(40, 40);
    }
    public Fox(){
        this(40,40);
    }

    @Override
    public  String toString(){
        return "🦊";
    }
}
