package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private PaintColor color;
    private int height;


    public Ceiling(PaintColor color, int height) {
        this.color = color;
        this.height = height;
    }

    public PaintColor getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }
    public void create(){
        System.out.println("Ceiling has been built.");
    }
}
