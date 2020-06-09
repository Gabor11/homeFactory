package Tshirt.TshirtDecorator;

import Tshirt.Tshirt;

public class BigPattern extends InkjetPrintingDecorator {
    Tshirt tshirt;

    public BigPattern(Tshirt tshirt){
        this.tshirt = tshirt;
    }

    @Override
    public double cost() {
        return 0.6 + tshirt.cost();
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", Big Pattern";
    }
}
