package org.example.cs230game;

import org.example.cs230game.ColorBasedMovable;
import org.example.cs230game.GameObject;
import org.example.cs230game.MoveDirection;
import org.example.cs230game.Updateable;

import java.util.ArrayList;

public class Player extends ColorBasedMovable implements Updateable {

    @Override
    public void update() {
        // if user presses UP
        move(MoveDirection.UP);

        // if user presses DOWN
        move(MoveDirection.DOWN);

        // if user presses up but we cant go up
        boolean success = move(MoveDirection.UP);
        if(!success) { }


    }

    // will be called when entering a new cell
    @Override
    protected void handleCollisions(ArrayList<GameObject> objects) {
        // for loop check for items to pickup and call `use` on them etc
    }
}
