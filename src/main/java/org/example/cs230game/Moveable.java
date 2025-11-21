package org.example.cs230game;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Pair;
import org.example.cs230game.GameObject;
import org.example.cs230game.LevelGrid;

import java.util.ArrayList;

enum MoveDirection {
    UP, DOWN, LEFT, RIGHT
}

public abstract class Moveable extends GameObject {
    protected LevelGrid levelGrid;

    Moveable(int row, int col, Node sprite) {
        super(row, col, sprite);
    }
    
    protected abstract boolean move(MoveDirection dir);

    protected abstract void handleCollisions(ArrayList<GameObject> objects);
}
