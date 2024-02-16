package com.example.loginui;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField confirmPassword;


    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private TextField age;

    @FXML
    private DatePicker birthday;

    @FXML
    private TextField email;

    @FXML
    private TextField mobile;

    @FXML
    private TextField civilStatus;

    @FXML
    private TextField country;

    @FXML
    private CheckBox gender1;

    @FXML
    private CheckBox gender2;

    @FXML
    protected void onButtonClick() {
        birthday.setValue(null);
        gender1.setSelected(false);
        gender2.setSelected(false);
        username.setText("");
        firstname.setText("");
        lastname.setText("");
        age.setText("");
        mobile.setText("");
        email.setText("");
        password.setText("");
        confirmPassword.setText("");
        civilStatus.setText("");
        country.setText("");

    }
}