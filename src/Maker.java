import Mug.Mug;
import Tshirt.Tshirt;
import Tshirt.TshirtDecorator.*;
import Tshirt.TshirtDecorator.LogoScreenPrinting;
import Tshirt.TshirtDecorator.TextScreenPrinting;

// Receiver
public class Maker {
    public static String tshirtType = "";
    public static String mugType = "";
    public static String[] screenPrintingList = null;
    public static String[] inkjetPrintingList = null;
    Tshirt tshirt;
    Mug mug;
    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Tshirt")){
            System.out.println(tshirtType + " order received.");

            TshirtFactory factory =  new TshirtFactory();
            tshirt = factory.makeTshirt(tshirtType);

            tshirt.prepareTshirt(tshirtType);
            tshirt.preparingPrintingTools(tshirtType);
            tshirt = decorate(screenPrintingList, inkjetPrintingList);

            System.out.println(tshirt.getDescription() + " order completed.");
            System.out.println("Cost: $" + tshirt.cost());

        }
        else if(factoryType.equalsIgnoreCase("Mug")){
            System.out.println(mugType + " order received.");

            MugFactory factory = new MugFactory();
            mug = factory.makeMug(mugType);
            mug.prepareMug();

            System.out.println(mug.getDescription() + " order completed.");
            System.out.print("Cost: $" + mug.cost());
        }
//        System.out.println("");
    }

    public Tshirt decorate(String[] screenPrintingList, String[] inkjetPrintingList){
        for (int i = 0; i < screenPrintingList.length; i++) {
            String screenPrintType = screenPrintingList[i];
            if(screenPrintType.equals("TextScreenPrinting")){
                tshirt = new TextScreenPrinting(tshirt);
            }
            else if(screenPrintType.equals("LogoScreenPrinting")){
                tshirt = new LogoScreenPrinting(tshirt);
            }
        }

        for (int i = 0; i < inkjetPrintingList.length; i++) {
            String inkjetPrintingType = inkjetPrintingList[i];
            if(inkjetPrintingType.equals("Logo")){
                tshirt = new Logo(tshirt);
            }
            else if(inkjetPrintingType.equals("Picture")){
                tshirt = new Picture(tshirt);
            }
            else if(inkjetPrintingType.equals("BigPattern")){
                tshirt = new BigPattern(tshirt);
            }
            else if(inkjetPrintingType.equals("SmallPattern")){
                tshirt = new SmallPattern(tshirt);
            }
        }
        return tshirt;
    }
}
