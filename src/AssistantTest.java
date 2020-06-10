import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AssistantTest {
    Assistant assistant = new Assistant();
    Maker maker = new Maker();
    String tshirtType = "Vneck Tshirt";
    String mugType = "NamedMug";
    String[] screenPrintingList = {"TextScreenPrinting"};
    String[] inkjetPrintingList = {"Logo", "SmallPattern"};
    MugOrder mugOrder = new MugOrder(maker, mugType);


    @Test
    void takeOrder_Mug() {
        assistant.takeOrder(mugOrder);
        assertEquals("Named Mug", maker.mug.getDescription());
    }

    @Test
    void takeOrder_TshirtFAIL() {
        assertThrows(NullPointerException.class, () -> maker.tshirt.getDescription());
    }

    @Test
    void takeOrder_Tshirt() {
        TshirtOrder tshirtOrder = new TshirtOrder(maker, tshirtType, screenPrintingList, inkjetPrintingList);
        assistant.takeOrder(tshirtOrder);
        assertEquals("V-neck T-shirt, Text Screen Printing, Logo, Small Pattern", maker.tshirt.getDescription());
    }
}