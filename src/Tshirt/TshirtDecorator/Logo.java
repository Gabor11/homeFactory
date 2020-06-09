package Tshirt.TshirtDecorator;

import Tshirt.Tshirt;

public class Logo extends InkjetPrintingDecorator {
    Tshirt tshirt;

    public Logo(Tshirt tshirt){
        this.tshirt = tshirt;
    }

    @Override
    public double cost() {
        return 0.35 + tshirt.cost();
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", Logo";
    }
}
