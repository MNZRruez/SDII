package com.example.loginui;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField logUsername;

    @FXML
    private TextField logPassword;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private TextField age;

    @FXML
    private TextField gender;

    @FXML
    private TextField email;
    @FXML
    private TextField signUsername;
    @FXML
    private TextField signPassword;

    @FXML
    protected void onButtonClick() {
        logUsername.setText("");
        logPassword.setText("");
        firstname.setText("");
        lastname.setText("");
        age.setText("");
        gender.setText("");
        email.setText("");
        signPassword.setText("");
        signUsername.setText("");


    }
}