package org.example.cs230game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Pair;

public class GameObject {
    protected Position position;
    private ImageView sprite;

    public GameObject(int row, int col, ImageView sprite) {
        position = new Position(row, col);
        this.sprite = sprite;
        setPosition(row, col);
    }

    public Position getPosition() { return position; }
    public void setPosition(int row, int col) {
        sprite.setLayoutX(col * Game.GRID_CELL_SIZE);
        sprite.setLayoutY(row * Game.GRID_CELL_SIZE);
        position.row = row;
        position.col = col;
    }

    public ImageView getNode() { return sprite; }

}
