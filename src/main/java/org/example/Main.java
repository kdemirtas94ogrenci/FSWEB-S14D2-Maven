package org.example;

import org.example.model.*;

import static org.example.model.enums.LampType.NORMAL;
import static org.example.model.enums.PaintColor.RED;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bedroom bedroom = new Bedroom("Ev", new Wall("North"), new Wall("South"), new Wall("East"), new Wall("West"), new Ceiling(RED, 1), new Bed("yumuşak", 5, 2, 3, 4), new Lamp(NORMAL, true, 5), new Wardrobe(5, 2, 4), new Carpet(RED, 5, 5));

    }
}