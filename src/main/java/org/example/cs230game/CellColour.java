package org.example.cs230game;

public enum CellColour {
    RED("/redtile.png"),
    BLUE("/bluetile.png"),
    GREEN("/greentile.png"),
    ORANGE("/orangetile.png");

    private final String text;

    CellColour(String colorstr) {
        text = colorstr;
    }

    @Override
    public String toString() {
        return text;
    }

}
