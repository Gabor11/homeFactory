package Mug;

public class LogoMug extends PrintedMug {
    double cost = 4.5;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "PicturedMug";
    }

    @Override
    public void printContent() {
        System.out.println("Printing the logo on the Mug");
    }
}
