package Mug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PicturedMug extends PrintedMug {
    double cost = 5.5;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "PicturedMug";
    }
}
