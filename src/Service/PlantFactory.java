package Service;

import Model.Entity.Plant;

public class PlantFactory {

    public PlantFactory() {
    }
    public Plant createPlant(){
        return new Plant(20);
    }

}
