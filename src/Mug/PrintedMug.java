package Mug;

public abstract class PrintedMug implements Mug {
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareMug() {
        preparePrinter();
        printContent();
        bakeTheMug();
    }

    public void preparePrinter(){
        System.out.println("Preparing printer");
    }

    public abstract void printContent();

    public void bakeTheMug(){
        System.out.println("Put it into the oven for a while");
    }

}
