public class Bear extends Predator{
    public Bear(int foodLevel, int health) {
        super(foodLevel, health);

    }
    public Bear(){
        this(120,120);
    }


    public Animal reproduction(Bear bear){
        if(bear.equals(bear)){
            return new Bear();
        }
        return null;
    }

    @Override
    public String toString() {
        return "🐻" ;
    }
}