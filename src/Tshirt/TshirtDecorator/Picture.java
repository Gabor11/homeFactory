package Tshirt.TshirtDecorator;


import Tshirt.Tshirt;

public class Picture extends InkjetPrintingDecorator {
    Tshirt tshirt;

    public Picture(Tshirt tshirt){
        this.tshirt = tshirt;
    }

    @Override
    public double cost() {
        return 0.50 + tshirt.cost();
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", Picture";
    }
}
