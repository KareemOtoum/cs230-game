package org.example.cs230game;

import javafx.geometry.Pos;
import javafx.util.Pair;
import org.example.cs230game.MoveDirection;
import org.example.cs230game.Moveable;

public abstract class NonColorBasedMovable extends Moveable {

    protected boolean move(MoveDirection direction) {
        Position prevPos = position;

        Position next = levelGrid.moveMovable(this, direction);

        if(prevPos != next) { // need to check collisions on new cell
            handleCollisions(levelGrid.getObjectsAt(next));
        }

        return prevPos != next;
    }
}