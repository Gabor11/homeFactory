package Mug;

public class ArtisticMug extends HandWrittenMug {
    @Override
    public double cost() {
        return 6.5;
    }

    @Override
    public String getDescription() {
        return "ArtisticMug";
    }

    @Override
    public void writeContent() {
        System.out.println("Carefully draw content on the mug");
    }
}
