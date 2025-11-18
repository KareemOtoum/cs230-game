package org.example.cs230game;

import javafx.scene.image.ImageView;
import javafx.util.Pair;

public abstract class ColorBasedMovable extends Moveable {

    ColorBasedMovable(int row, int col, ImageView sprite) {
        super(row, col, sprite);
    }

    protected boolean move(MoveDirection direction) {
        Position prevPos = position;

        Position next = levelGrid.moveMovable(this, direction);

        if(prevPos != next) { // need to check collisions on new cell
            handleCollisions(levelGrid.getObjectsAt(next));
        }

        return prevPos != next;
    }
}
