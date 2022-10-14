package Auto.decoratorsMersedes;

import Auto.*;

public class amgOne extends DecoratorMercedes {
    public amgOne(AutomobileMercedesBenz auto) {
        this.auto = auto;
    }
    public String getDescription() {
        return auto.getDescription() + "with trim, ";
    }
    public double cost() {
        return auto.cost() + 210000;
    }
}