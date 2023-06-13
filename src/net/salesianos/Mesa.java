package net.salesianos;

import java.io.Serializable;
import java.util.Scanner;

public class Mesa implements Serializable {
    private String color;
    private int nPatas;

    public Mesa(String color, int nPatas) {
        this.color = color;
        this.nPatas = nPatas;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nNúmero de patas: " + nPatas;
    }

}
