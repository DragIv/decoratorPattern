package Auto.allCars;

import Auto.AutomobileMercedesBenz;

public class MercedesSLRoadster extends AutomobileMercedesBenz {
    @Override
    public double cost() {
        return 9600000;
    }
    public MercedesSLRoadster(){
        description = "Mercedes SL Roadster ";
    }
}
