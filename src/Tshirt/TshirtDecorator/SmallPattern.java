package Tshirt.TshirtDecorator;

import Tshirt.Tshirt;

public class SmallPattern extends InkjetPrintingDecorator {
    Tshirt tshirt;

    public SmallPattern(Tshirt tshirt){
        this.tshirt = tshirt;
    }

    @Override
    public double cost() {
        return 0.3 + tshirt.cost();
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", Small Pattern";
    }
}
