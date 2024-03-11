package com.caffetteria.caffetteriajavafx;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Titolo extends StackPane {

    private Main main;
    private Label label;


    public Titolo(Main main){
        this.main = main;
        setMinHeight(V.HEIGHT/20);
        this.label = new Label("CAFFETTERIA");
        setAlignment(Pos.BOTTOM_CENTER);
        getChildren().add(label);
    }
    public Main getMain() {
        return main;
    }
}
