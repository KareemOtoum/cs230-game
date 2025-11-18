package org.example.cs230game;

import javafx.util.Pair;

public abstract class ColorBasedMovable extends Moveable {

    protected boolean move(MoveDirection direction) {
        Position prevPos = position;

        Position next = levelGrid.moveMovable(this, direction);

        if(prevPos != next) { // need to check collisions on new cell
            handleCollisions(levelGrid.getObjectsAt(next));
        }

        return prevPos != next;
    }
}
