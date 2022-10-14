package Auto;

import Auto.allCars.*;
import Auto.decoratorBMW.trackPage;
import Auto.decoratorBMW.sportPro;
import Auto.decoratorsMersedes.*;

import java.util.ArrayList;

public class dealerСenter {
    public static void main(String[] args) {

        AutomobileMercedesBenz automobile = new MercedesAMGE53();
        AutomobileMercedesBenz automobile2 = new MercedesAMGGLC();
        AutomobileMercedesBenz automobile3 = new MercedesSLRoadster();
        AutomobileBMW automobile4 = new BMWM3Competition();
        AutomobileBMW automobile5 = new BMWZ4sDrive20i();

        ArrayList<Object> carsM = new ArrayList<>();
        carsM.add(automobile);
        carsM.add(automobile2);
        carsM.add(automobile3);
        carsM.add(automobile4);
        carsM.add(automobile5);


        System.out.println("Full set:");
        for (Object e : carsM) {
            if(e instanceof AutomobileMercedesBenz){
                e = new Auto.decoratorsMersedes.trackPage((AutomobileMercedesBenz) e);
                e = new amgNight((AutomobileMercedesBenz) e);
                e = new amgOne((AutomobileMercedesBenz) e);
                System.out.println(((AutomobileMercedesBenz) e).getDescription() + ((AutomobileMercedesBenz) e).cost()+"P");
            }
            else {
               e = new sportPro((AutomobileBMW) e);
               e = new trackPage((AutomobileBMW) e);
               System.out.println(((AutomobileBMW) e).getDescription() + ((AutomobileBMW) e).cost()+"P");
            }

        }

        System.out.println();
        System.out.println("Without a complete set:");
        for (Object e : carsM) {
            if(e instanceof AutomobileMercedesBenz){
                System.out.println(((AutomobileMercedesBenz) e).getDescription() + ((AutomobileMercedesBenz) e).cost()+"P");
            }
            else {
                System.out.println(((AutomobileBMW) e).getDescription() + ((AutomobileBMW) e).cost()+"P");
            }

        }

    }



}


