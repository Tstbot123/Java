package org.apps.advancewars.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

// The file was previously named "WinningScreenController.java"...
public class VictoryScreenController {

    @FXML
    private Label victoryLabel;

    public void setWinningTeam(String winningTeam) {
        victoryLabel.setText(winningTeam + " wins!");
    }
}
