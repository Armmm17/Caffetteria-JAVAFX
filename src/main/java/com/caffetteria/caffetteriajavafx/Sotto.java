package com.caffetteria.caffetteriajavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Sotto extends HBox {

    private Main main;
    private Label label;
    private double credit;


    public Sotto(Main main){
        this.main = main;

        setMinWidth(135);

        setAlignment(Pos.CENTER);

        this.label = new Label("Credit: " + this.credit + "$");

        Button b1 = new Button("0.50 $");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                getMain().getSotto().setCredit(credit + 0.5);
                getMain().getSotto().getLabel().setText("Credit: " + credit + "$");


            }
        });

        Button b2 = new Button("1.00 $");
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                getMain().getSotto().setCredit(credit + 1);
                getMain().getSotto().getLabel().setText("Credit: " + credit + "$");


            }
        });

        Button b3 = new Button("2.00 $");
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                getMain().getSotto().setCredit(credit + 2);
                getMain().getSotto().getLabel().setText("Credit: " + credit + "$");
            }
        });

        getChildren().add(this.label);
        getChildren().add(b1);
        getChildren().add(b2);
        getChildren().add(b3);

    }

    public Main getMain() {
        return main;
    }

    public Label getLabel() {
        return label;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
