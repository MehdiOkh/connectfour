package main;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import logic.ComputerMove;
import logic.Table;

import java.awt.event.KeyEvent;
import java.beans.EventHandler;
import java.io.IOException;

public class Controller {

    private Table table;
    private int turn;
    private String winner;

    @FXML
    private Rectangle sideColor;
    @FXML
    private Text turnText;
    @FXML
    private Rectangle greyShade;
    @FXML
    private AnchorPane menu;
    @FXML
    private Text winnerText;
    @FXML
    private GridPane main;


    @FXML
    private Rectangle th0;
    @FXML
    private Rectangle th1;
    @FXML
    private Rectangle th2;
    @FXML
    private Rectangle th3;
    @FXML
    private Rectangle th4;
    @FXML
    private Rectangle th5;
    @FXML
    private Rectangle th6;

    @FXML
    private ImageView hover0;
    @FXML
    private ImageView hover1;
    @FXML
    private ImageView hover2;
    @FXML
    private ImageView hover3;
    @FXML
    private ImageView hover4;
    @FXML
    private ImageView hover5;
    @FXML
    private ImageView hover6;

    @FXML
    private ImageView rp00;
    @FXML
    private ImageView rp01;
    @FXML
    private ImageView rp02;
    @FXML
    private ImageView rp03;
    @FXML
    private ImageView rp04;
    @FXML
    private ImageView rp05;
    @FXML
    private ImageView rp06;
    @FXML
    private ImageView rp10;
    @FXML
    private ImageView rp11;
    @FXML
    private ImageView rp12;
    @FXML
    private ImageView rp13;
    @FXML
    private ImageView rp14;
    @FXML
    private ImageView rp15;
    @FXML
    private ImageView rp16;
    @FXML
    private ImageView rp20;
    @FXML
    private ImageView rp21;
    @FXML
    private ImageView rp22;
    @FXML
    private ImageView rp23;
    @FXML
    private ImageView rp24;
    @FXML
    private ImageView rp25;
    @FXML
    private ImageView rp26;
    @FXML
    private ImageView rp30;
    @FXML
    private ImageView rp31;
    @FXML
    private ImageView rp32;
    @FXML
    private ImageView rp33;
    @FXML
    private ImageView rp34;
    @FXML
    private ImageView rp35;
    @FXML
    private ImageView rp36;
    @FXML
    private ImageView rp40;
    @FXML
    private ImageView rp41;
    @FXML
    private ImageView rp42;
    @FXML
    private ImageView rp43;
    @FXML
    private ImageView rp44;
    @FXML
    private ImageView rp45;
    @FXML
    private ImageView rp46;
    @FXML
    private ImageView rp50;
    @FXML
    private ImageView rp51;
    @FXML
    private ImageView rp52;
    @FXML
    private ImageView rp53;
    @FXML
    private ImageView rp54;
    @FXML
    private ImageView rp55;
    @FXML
    private ImageView rp56;

    @FXML
    private ImageView yp00;
    @FXML
    private ImageView yp01;
    @FXML
    private ImageView yp02;
    @FXML
    private ImageView yp03;
    @FXML
    private ImageView yp04;
    @FXML
    private ImageView yp05;
    @FXML
    private ImageView yp06;
    @FXML
    private ImageView yp10;
    @FXML
    private ImageView yp11;
    @FXML
    private ImageView yp12;
    @FXML
    private ImageView yp13;
    @FXML
    private ImageView yp14;
    @FXML
    private ImageView yp15;
    @FXML
    private ImageView yp16;
    @FXML
    private ImageView yp20;
    @FXML
    private ImageView yp21;
    @FXML
    private ImageView yp22;
    @FXML
    private ImageView yp23;
    @FXML
    private ImageView yp24;
    @FXML
    private ImageView yp25;
    @FXML
    private ImageView yp26;
    @FXML
    private ImageView yp30;
    @FXML
    private ImageView yp31;
    @FXML
    private ImageView yp32;
    @FXML
    private ImageView yp33;
    @FXML
    private ImageView yp34;
    @FXML
    private ImageView yp35;
    @FXML
    private ImageView yp36;
    @FXML
    private ImageView yp40;
    @FXML
    private ImageView yp41;
    @FXML
    private ImageView yp42;
    @FXML
    private ImageView yp43;
    @FXML
    private ImageView yp44;
    @FXML
    private ImageView yp45;
    @FXML
    private ImageView yp46;
    @FXML
    private ImageView yp50;
    @FXML
    private ImageView yp51;
    @FXML
    private ImageView yp52;
    @FXML
    private ImageView yp53;
    @FXML
    private ImageView yp54;
    @FXML
    private ImageView yp55;
    @FXML
    private ImageView yp56;

    public void initialize() {
        twoPlayerMode();
    }

    public void onPlay(){
        if (turn%2 == 0){
            turnText.setText("Red's Turn...");
            turnText.setFill(Color.web("#e53d3d"));
            sideColor.setFill(Color.web("#e53d3d"));
        }else {
            turnText.setText("Yellow's Turn...");
            turnText.setFill(Color.web("#f7d537"));
            sideColor.setFill(Color.web("#f7d537"));
        }
    }
    public void singlePlayer() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("singlePlayer.fxml"));
        main.getScene().setRoot(root);

    }
    public void twoPlayer() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("twoPlayer.fxml"));
        main.getScene().setRoot(root);

    }
    public void openMenu(){
        greyShade.setVisible(true);
        menu.setVisible(true);
    }
    public void closeMenu(){
        greyShade.setVisible(false);
        menu.setVisible(false);
    }
    public void twoPlayerMode(){


        table = new Table();
        turn = 0;

        ImageView[][] redPins =
                {{rp00, rp01,rp02,rp03,rp04,rp05,rp06},
                        {rp10, rp11,rp12,rp13,rp14,rp15,rp16},
                        {rp20, rp21,rp22,rp23,rp24,rp25,rp26},
                        {rp30, rp31,rp32,rp33,rp34,rp35,rp36},
                        {rp40, rp41,rp42,rp43,rp44,rp45,rp46},
                        {rp50, rp51,rp52,rp53,rp54,rp55,rp56}};
        ImageView[][] yellowPins =
                {{yp00, yp01, yp02, yp03, yp04, yp05, yp06},
                        {yp10, yp11, yp12, yp13, yp14, yp15, yp16},
                        {yp20, yp21, yp22, yp23, yp24, yp25, yp26},
                        {yp30, yp31, yp32, yp33, yp34, yp35, yp36},
                        {yp40, yp41, yp42, yp43, yp44, yp45, yp46},
                        {yp50, yp51, yp52, yp53, yp54, yp55, yp56}};

        th0.setOnMouseEntered(event -> hover0.setVisible(true));
        th0.setOnMouseExited(event -> hover0.setVisible(false));
        th0.setOnMousePressed(event -> {
            if (table.emptyRow(0)!=-1){
                String pinColor;
                ImageView[][] temp;
                if (turn%2 == 0){
                    pinColor = "red";
                    temp = redPins;
                }else {
                    pinColor = "yellow";
                    temp = yellowPins;
                }
                temp[table.emptyRow(0)][0].setVisible(true);
                table.insertPin(pinColor,table.emptyRow(0),0);
                winner = table.winnerCheck(pinColor,table.emptyRow(0)+1,0) ;
                if (winner.equals(pinColor)){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText(pinColor+" is winner!!!");
                }else if(winner.equals("draw")){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText("Draw!!!");
                }
                turn++;
            }
        });

        th1.setOnMouseEntered(event -> hover1.setVisible(true));
        th1.setOnMouseExited(event -> hover1.setVisible(false));
        th1.setOnMousePressed(event -> {
            if (table.emptyRow(1)!=-1){
                String pinColor;
                ImageView[][] temp;
                if (turn%2 == 0){
                    pinColor = "red";
                    temp = redPins;
                }else {
                    pinColor = "yellow";
                    temp = yellowPins;
                }
                temp[table.emptyRow(1)][1].setVisible(true);
                table.insertPin(pinColor,table.emptyRow(1),1);
                winner = table.winnerCheck(pinColor,table.emptyRow(1)+1,1);
                if (winner.equals(pinColor)){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText(pinColor+" is winner!!!");
                }else if(winner.equals("draw")){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText("Draw!!!");
                }
                turn++;
            }
        });

        th2.setOnMouseEntered(event -> hover2.setVisible(true));
        th2.setOnMouseExited(event -> hover2.setVisible(false));
        th2.setOnMousePressed(event -> {
            if (table.emptyRow(2)!=-1){
                String pinColor;
                ImageView[][] temp;
                if (turn%2 == 0){
                    pinColor = "red";
                    temp = redPins;
                }else {
                    pinColor = "yellow";
                    temp = yellowPins;
                }
                temp[table.emptyRow(2)][2].setVisible(true);
                table.insertPin(pinColor,table.emptyRow(2),2);
                winner = table.winnerCheck(pinColor,table.emptyRow(2)+1,2);
                if (winner.equals(pinColor)){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText(pinColor+" is winner!!!");
                }else if(winner.equals("draw")){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText("Draw!!!");
                }
                turn++;
            }
        });

        th3.setOnMouseEntered(event -> hover3.setVisible(true));
        th3.setOnMouseExited(event -> hover3.setVisible(false));
        th3.setOnMousePressed(event -> {
            if (table.emptyRow(3)!=-1){
                String pinColor;
                ImageView[][] temp;
                if (turn%2 == 0){
                    pinColor = "red";
                    temp = redPins;
                }else {
                    pinColor = "yellow";
                    temp = yellowPins;
                }
                temp[table.emptyRow(3)][3].setVisible(true);
                table.insertPin(pinColor,table.emptyRow(3),3);
                winner = table.winnerCheck(pinColor,table.emptyRow(3)+1,3);
                if (winner.equals(pinColor)){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText(pinColor+" is winner!!!");
                }else if(winner.equals("draw")){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText("Draw!!!");
                }
                turn++;

            }
        });

        th4.setOnMouseEntered(event -> hover4.setVisible(true));
        th4.setOnMouseExited(event -> hover4.setVisible(false));
        th4.setOnMousePressed(event -> {
            if (table.emptyRow(4)!=-1){
                String pinColor;
                ImageView[][] temp;
                if (turn%2 == 0){
                    pinColor = "red";
                    temp = redPins;
                }else {
                    pinColor = "yellow";
                    temp = yellowPins;
                }
                temp[table.emptyRow(4)][4].setVisible(true);
                table.insertPin(pinColor,table.emptyRow(4),4);
                winner = table.winnerCheck(pinColor,table.emptyRow(4)+1,4);
                if (winner.equals(pinColor)){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText(pinColor+" is winner!!!");
                }else if(winner.equals("draw")){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText("Draw!!!");
                }
                turn++;
            }
        });

        th5.setOnMouseEntered(event -> hover5.setVisible(true));
        th5.setOnMouseExited(event -> hover5.setVisible(false));
        th5.setOnMousePressed(event -> {
            if (table.emptyRow(5)!=-1){
                String pinColor;
                ImageView[][] temp;
                if (turn%2 == 0){
                    pinColor = "red";
                    temp = redPins;
                }else {
                    pinColor = "yellow";
                    temp = yellowPins;
                }
                temp[table.emptyRow(5)][5].setVisible(true);
                table.insertPin(pinColor,table.emptyRow(5),5);
                winner = table.winnerCheck(pinColor,table.emptyRow(5)+1,5);
                if (winner.equals(pinColor)){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText(pinColor+" is winner!!!");
                }else if(winner.equals("draw")){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText("Draw!!!");
                }
                turn++;
            }
        });

        th6.setOnMouseEntered(event -> hover6.setVisible(true));
        th6.setOnMouseExited(event -> hover6.setVisible(false));
        th6.setOnMousePressed(event -> {
            if (table.emptyRow(6)!=-1){
                String pinColor;
                ImageView[][] temp;
                if (turn%2 == 0){
                    pinColor = "red";
                    temp = redPins;
                }else {
                    pinColor = "yellow";
                    temp = yellowPins;
                }
                temp[table.emptyRow(6)][6].setVisible(true);
                table.insertPin(pinColor,table.emptyRow(6),6);
                winner = table.winnerCheck(pinColor,table.emptyRow(6)+1,6);
                if (winner.equals(pinColor)){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText(pinColor+" is winner!!!");
                }else if(winner.equals("draw")){
                    greyShade.setVisible(true);
                    menu.setVisible(true);
                    winnerText.setText("Draw!!!");
                }
                turn++;
            }
        });
    }

}
