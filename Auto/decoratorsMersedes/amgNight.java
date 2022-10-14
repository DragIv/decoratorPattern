package Auto.decoratorsMersedes;

import Auto.*;

public class amgNight extends DecoratorMercedes {
    public amgNight(AutomobileMercedesBenz auto) {
        this.auto = auto;
    }
    public String getDescription() {
        return auto.getDescription() + "with amgNight, ";
    }
    public double cost() {
        return auto.cost() + 114000;
    }
}
