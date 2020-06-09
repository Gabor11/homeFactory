package Tshirt.TshirtDecorator;

import Tshirt.Tshirt;

public class TextScreenPrinting extends ScreenPrintingDecorator {
    Tshirt tshirt;

    public TextScreenPrinting(Tshirt tshirt){
        this.tshirt = tshirt;
    }

    @Override
    public double cost() {
        return 0.3 + tshirt.cost();
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", Text Screen Printing";
    }
}
