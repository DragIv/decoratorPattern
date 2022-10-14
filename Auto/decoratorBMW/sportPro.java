package Auto.decoratorBMW;

import Auto.AutomobileBMW;
import Auto.DecoratorBMW;

public class sportPro extends DecoratorBMW {
    public sportPro(AutomobileBMW auto) {
        this.auto = auto;
    }
    public String getDescription() {
        return auto.getDescription() + "Sport Pro, ";
    }
    public double cost() {
        return auto.cost() + 980000;
    }
}
