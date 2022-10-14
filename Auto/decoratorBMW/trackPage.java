package Auto.decoratorBMW;

import Auto.AutomobileBMW;
import Auto.DecoratorBMW;

public class trackPage extends DecoratorBMW {
    public trackPage(AutomobileBMW auto) {
        this.auto = auto;
    }
    public String getDescription() {
        return auto.getDescription() + "with trackPage, ";
    }
    public double cost() {
        return auto.cost() + 90000;
    }
}
