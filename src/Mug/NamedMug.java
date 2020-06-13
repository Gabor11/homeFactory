package Mug;

public class NamedMug extends HandWrittenMug {
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Named Mug";
    }

    @Override
    public void writeContent() {
        System.out.println("Carefully write content on the mug");
    }
}
