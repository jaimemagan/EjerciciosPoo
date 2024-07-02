package com.example;

import javafx.scene.image.Image;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class TableroController {
    @FXML
    private ImageView player1Avatar;
    @FXML
    private ImageView player2Avatar;
    @FXML
    private ImageView player3Avatar;
    @FXML
    private ImageView player4Avatar;
    @FXML
    private ImageView card1;
    @FXML
    private ImageView card2;
    @FXML
    private ImageView card3;
    @FXML
    private ImageView centralCard;
    @FXML
    private ImageView deck;

    public void initialize() {
        // Aquí puedes cargar las imágenes de los avatares y las cartas.
        player1Avatar.setImage(new Image("path/to/avatar1.png"));
        player2Avatar.setImage(new Image("path/to/avatar2.png"));
        player3Avatar.setImage(new Image("path/to/avatar3.png"));
        player4Avatar.setImage(new Image("path/to/avatar4.png"));

        card1.setImage(new Image("path/to/card1.png"));
        card2.setImage(new Image("path/to/card2.png"));
        card3.setImage(new Image("path/to/card3.png"));
        centralCard.setImage(new Image("path/to/centralCard.png"));
        deck.setImage(new Image("path/to/deck.png"));
    }
}