package Tshirt.TshirtDecorator;

import Tshirt.Tshirt;
import Tshirt.NormalTshirt;

import static org.junit.jupiter.api.Assertions.*;

class LogoScreenPrintingTest {
    Tshirt tshirt = new NormalTshirt();
    final LogoScreenPrinting LSP = new LogoScreenPrinting(tshirt);

    @org.junit.jupiter.api.Test
    void cost() {
        assertEquals(LSP.cost(), 4.25);
    }

    @org.junit.jupiter.api.Test
    void getDescription() {
        assertEquals(LSP.getDescription(), "Normal T-shirt, Logo Screen Printing");
    }
}