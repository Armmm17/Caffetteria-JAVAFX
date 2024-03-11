package com.caffetteria.caffetteriajavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage stage;
    private Titolo titolo;
    private Sopra sopra;
    private Sotto sotto;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;

        VBox root = new VBox();

        Scene scene = new Scene(root, V.WIDTH, V.HEIGHT);

        this.titolo = new Titolo(this);
        this.sopra = new Sopra(this);
        this.sotto = new Sotto(this);

        root.getChildren().add(this.titolo);
        root.getChildren().add(this.sopra);
        root.getChildren().add(this.sotto);


        stage.setTitle(V.TITOLO);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }


    public Stage getStage() {
        return stage;
    }

    public Sopra getSopra() {
        return sopra;
    }

    public Sotto getSotto() {
        return sotto;
    }

    public static void main(String[] args) {
        launch();
    }
}