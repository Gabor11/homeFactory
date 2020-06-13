package Mug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class HandWrittenMug implements Mug {
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareMug() {
        prepareDecorPen();
        writeContent();
        bakingTheMug();
    }

    public void prepareDecorPen(){
        System.out.println("Preparing special pen for ceramics");
    }

    public abstract void writeContent();

    public void bakingTheMug(){
        System.out.println("Put it into the oven for a while");
    }
}
