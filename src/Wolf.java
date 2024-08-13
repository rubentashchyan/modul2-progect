public class Wolf extends Predator{
    public Wolf(int foodLevel, int health) {
        super(60, 60);
    }

    public Wolf (){
        this(60,60);
    }
    @Override
    public  String toString(){
        return "🐺";
    }
}
