package com.example.cs2450homework2;

//Jimmy Chu
//CS2450
//Assignment 1
//2/26/2023

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TaskA extends Application {
    private double foodCost;
    private double tipAmountEnd;
    private double taxAmountEnd;
    private double totalAmountEnd;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Task A Tip, Tax, and Total");

        Label foodCostLabel = new Label("Food Charge:");
        TextField foodCostText = new TextField();
        Button calculate = new Button("Calculate");

        Label tip = new Label("18% Tip:");
        Label tipAmount = new Label();

        Label tax = new Label("7% Sales Tax:");
        Label taxAmount = new Label();

        Label total = new Label("Total:");
        Label totalAmount = new Label();

        GridPane gridPane = new GridPane();

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(foodCostLabel, 0, 0);
        gridPane.add(foodCostText, 1, 0);

        gridPane.add(calculate, 2, 0);

        gridPane.add(tip, 0, 1);
        gridPane.add(tipAmount, 1, 1);

        gridPane.add(tax, 0, 2);
        gridPane.add(taxAmount, 1, 2);

        gridPane.add(total, 0, 3);
        gridPane.add(totalAmount, 1, 3);

        calculate.setOnAction(event -> {
            foodCost = Double.parseDouble(foodCostText.getText());

            tipAmountEnd = foodCost * 0.18;
            taxAmountEnd = foodCost * 0.07;
            totalAmountEnd = foodCost + tipAmountEnd + taxAmountEnd;

            tipAmount.setText(String.format("$ %.2f", tipAmountEnd));
            taxAmount.setText(String.format("$ %.2f", taxAmountEnd));
            totalAmount.setText(String.format("$ %.2f", totalAmountEnd));
        });

        Scene scene = new Scene(gridPane, 350, 150);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
