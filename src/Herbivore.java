public class Herbivore extends Animal implements Eatable{
    public Herbivore(int foodLevel, int health) {
        super(foodLevel, health);
    }
    @Override
    public boolean isEatable(){
        return true;
    }
}
