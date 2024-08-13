public  class Predator extends Animal implements Eatable {
    public Predator(int foodLevel, int health) {
        super(foodLevel, health);

    }

    @Override
    public boolean isEatable() {
        return false;
    }

    public Animal reproduction (Animal animal){
        if(animal.equals(animal)){
            return new Animal();
        }
        return null;
    }
}
