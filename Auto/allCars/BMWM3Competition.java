package Auto.allCars;

import Auto.AutomobileBMW;

public class BMWM3Competition extends AutomobileBMW {
    @Override
    public double cost() {
        return 8900000;
    }

    public BMWM3Competition(){
        description = "BMW M3 Competition ";
    }
}