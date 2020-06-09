// Component

package Tshirt;

public abstract class Tshirt {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareTshirt(String type) {
        System.out.println("Preparing "+ type );
    }

    public void preparingPrintingTools(String type) {
        System.out.println("Preparing tools for " + type );
    }
}
