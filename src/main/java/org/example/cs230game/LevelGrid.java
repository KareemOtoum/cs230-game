package org.example.cs230game;

import javafx.geometry.Pos;
import javafx.util.Pair;
import org.example.cs230game.ColorBasedMovable;
import org.example.cs230game.GameObject;
import org.example.cs230game.GridCell;

import java.util.ArrayList;

public class LevelGrid {
    private ArrayList<ArrayList<GridCell>> grid;

    public LevelGrid(ArrayList<ArrayList<GridCell>> grid) {
        this.grid = grid;
    }

    // move a colorbased movable
    public Position moveMovable(ColorBasedMovable movable, MoveDirection direction) {
        
        // get objects current position
        Position pos = movable.getPosition();

        // walk through level grid to see where it can move to next
        // and return that position
        return new Position(0, 0);
    }

    // move a non colorbased movable
    Position moveMovable(NonColorBasedMovable movable, MoveDirection direction) {
        
        // get objects current position
        Position pos = movable.getPosition();

        // walk through level grid to see where it can move to next
        // and return that position
        return new Position(0, 0);
    }

    public ArrayList<GameObject> getObjectsAt(Position position) {
        return grid.get(position.row).get(position.col).getObjects();
    }
}
