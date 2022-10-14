package Auto.decoratorsMersedes;

import Auto.*;

public class trackPage extends DecoratorMercedes {
    public trackPage(AutomobileMercedesBenz auto) {
        this.auto = auto;
    }
    public String getDescription() {
        return auto.getDescription() + "with trackPage, ";
    }
    public double cost() {
        return auto.cost() + 30000;
    }
}
