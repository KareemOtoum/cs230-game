package org.example.cs230game;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game extends Application {
    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;
    public static final int WORLD_WIDTH = 1280;
    public static final int WORLD_HEIGHT = 720;
    public static final int GRID_CELL_SIZE = 64;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Game.class.getResource("hello-view.fxml"));

        Pane world = new Pane();
        world.setPrefSize(WORLD_WIDTH, WORLD_HEIGHT);



//        AnimationTimer timer = new AnimationTimer() {
//
//            private long lastTime = 0;
//
//            @Override
//            public void handle(long now) {
//                if (lastTime > 0) {
//                    double dt = (now - lastTime) / 1e9; // seconds
//                    manager.update(dt);
//                }
//                lastTime = now;
//            }
//        };

//      timer.start();


        Scene scene = new Scene(world);
        Player player = new Player(0, 0, new ImageView(getClass().getResource("/frogplayer.png").toString()), scene);
        ArrayList<GridCell> cells = new ArrayList<>();

        CellColour[] col1 = new CellColour[]{CellColour.RED, CellColour.BLUE, CellColour.RED, CellColour.BLUE};
        cells.add(new GridCell(col1, 0, 0));

        CellColour[] col2 = new CellColour[]{CellColour.GREEN, CellColour.ORANGE, CellColour.GREEN, CellColour.ORANGE};
        cells.add(new GridCell(col2, 0, 1));

        CellColour[] col3 = new CellColour[]{CellColour.RED, CellColour.RED, CellColour.RED, CellColour.RED};
        cells.add(new GridCell(col3, 0, 2));

        for(GridCell cell : cells) {
            world.getChildren().add(cell.getNode());
        }
        world.getChildren().add(player.getNode());

        ArrayList<Updateable> updateables = new ArrayList<>();
        updateables.add(player);

        stage.setTitle("Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}