package Tshirt.TshirtDecorator;

import Tshirt.Tshirt;

public class LogoScreenPrinting extends ScreenPrintingDecorator {
    Tshirt tshirt;

    public LogoScreenPrinting(Tshirt tshirt){
        this.tshirt = tshirt;
    }

    @Override
    public double cost() {
        return 0.25 + tshirt.cost();
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", Logo Screen Printing";
    }
}
