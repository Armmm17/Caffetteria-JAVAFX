package com.caffetteria.caffetteriajavafx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;

public class Sopra extends HBox {
    private Main main;
    private Label label;
    private Button btn;
    private Card caffe;
    private Card tea;
    private Card choc;
    private Card capp;

    public Sopra(Main main){
        this.main = main;
        setBackground(new Background(new BackgroundFill(Paint.valueOf("grey"), CornerRadii.EMPTY, Insets.EMPTY)));
        setMinHeight(V.HEIGHT/20*5);
        setAlignment(Pos.CENTER);

        this.caffe = new Card(this, "Caffe", 0.5);
        this.tea = new Card(this, "Te",0.7);
        this.choc = new Card(this, "Cioccolata",1.20);
        this.capp = new Card(this, "Cappuccino",1.20);



        getChildren().add(caffe);
        getChildren().add(tea);
        getChildren().add(choc);
        getChildren().add(capp);

    }

    public Main getMain() {
        return main;
    }

    public Label getLabel() {
        return label;
    }

    public Button getBtn() {
        return btn;
    }

    public Card getCaffe() {
        return caffe;
    }

    public Card getTea() {
        return tea;
    }

    public Card getChoc() {
        return choc;
    }

    public Card getCapp() {
        return capp;
    }
}
