package com.caffetteria.caffetteriajavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

public class Card extends VBox {

    private Main main;
    private Sopra sopra;
    private Button btn;
    private Label price;
    public Card(Sopra sopra, String name, double price){
        this.sopra = sopra;
        setBackground(new Background(new BackgroundFill(Paint.valueOf("white"), CornerRadii.EMPTY, Insets.EMPTY)));
        setMinWidth(135);
        setAlignment(Pos.CENTER);

        this.btn = new Button(name);
        this.price = new Label("$" + price);

        this.btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                getSopra().getMain().getSotto().setCredit(getSopra().getMain().getSotto().getCredit() - price);
                getSopra().getMain().getSotto().getLabel().setText("Credit: " + getSopra().getMain().getSotto().getCredit() + "$");
            }
        });


        getChildren().add(this.btn);
        getChildren().add(this.price);

    }

    public Sopra getSopra() {
        return sopra;
    }

    public Button getBtn() {
        return btn;
    }

    public Label getPrice() {
        return price;
    }
}
