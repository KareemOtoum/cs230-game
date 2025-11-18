package org.example.cs230game;

import javafx.util.Pair;
import org.example.cs230game.GameObject;
import org.example.cs230game.LevelGrid;

import java.util.ArrayList;

enum MoveDirection {
    UP, DOWN, LEFT, RIGHT
}

public abstract class Moveable extends GameObject {
    protected LevelGrid levelGrid;

    public void setPosition(Pair<Integer, Integer> pos) { }
    
    protected abstract boolean move(MoveDirection dir);

    protected abstract void handleCollisions(ArrayList<GameObject> objects);
}
