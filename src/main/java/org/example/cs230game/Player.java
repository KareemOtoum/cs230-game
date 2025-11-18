package org.example.cs230game;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import org.example.cs230game.ColorBasedMovable;
import org.example.cs230game.GameObject;
import org.example.cs230game.MoveDirection;
import org.example.cs230game.Updateable;

import java.util.ArrayList;

public class Player extends ColorBasedMovable implements Updateable {

    Player(int row, int col, ImageView sprite, Scene scene) {
        super(row, col, sprite);
        setupInput(scene);
    }

    private void setupInput(Scene scene) {
        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case W -> setPosition(position.row - 1, position.col);
                case A -> setPosition(position.row, position.col - 1);
                case S -> setPosition(position.row + 1, position.col);
                case D -> setPosition(position.row, position.col + 1);
            }
        });

    }


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
