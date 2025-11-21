package org.example.cs230game;

import javafx.scene.Group;
import javafx.scene.control.Cell;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import org.example.cs230game.GameObject;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GridCell extends GameObject {
    public static final int TILE_FACE_SIZE = 32;

    private ArrayList<GameObject> gameObjects;
    private Group faces;
    private CellColour[] colours;

    public GridCell(CellColour[] colours, int row, int col) {
        super();
        assert(colours.length == 4);

        this.colours = new CellColour[]{colours[0], colours[1], colours[2], colours[3]};
        String tlPath = colours[0].toString();
        ImageView topleft = new ImageView(getClass().getResource(tlPath).toString());
        topleft.setX(0);
        topleft.setY(0);

        String trPath = colours[1].toString();
        ImageView topright = new ImageView(getClass().getResource(trPath).toString());
        topright.setX(TILE_FACE_SIZE);
        topright.setY(0);

        String blPath = colours[2].toString();
        ImageView botleft = new ImageView(getClass().getResource(blPath).toString());
        botleft.setX(0);
        botleft.setY(TILE_FACE_SIZE);

        String brPath = colours[3].toString();
        ImageView botright = new ImageView(getClass().getResource(brPath).toString());
        botright.setX(TILE_FACE_SIZE);
        botright.setY(TILE_FACE_SIZE);
        faces = new Group(topleft, topright, botleft, botright);
        setNode(faces);
        setPosition(row, col);
    }

    public ArrayList<GameObject> getObjects() { return gameObjects; }
}
