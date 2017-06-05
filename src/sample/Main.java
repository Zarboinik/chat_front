package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sample.components.MenuBox;
import sample.components.MenuButtonItem;
import sample.components.SubMenu;
import sample.components.SubMenuForChat;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = new Pane();
        Image image = new Image(getClass().getResourceAsStream("chat.jpg"));
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(900);
        root.getChildren().add(img);

        MenuButtonItem login = new MenuButtonItem("Авторизация");
        MenuButtonItem registration = new MenuButtonItem("Регистрация");
        MenuButtonItem exit = new MenuButtonItem("Выход");
        SubMenu mainMenu = new SubMenu(login,registration,exit);

        TextField loginText = new TextField();
        loginText.setPrefHeight(50);
        loginText.setFont(Font.font("Arial", FontWeight.BOLD,16));
        MenuButtonItem enter = new MenuButtonItem("Вход");
        MenuButtonItem back1 = new MenuButtonItem("Назад");
        SubMenu menuLogin = new SubMenu(loginText, enter, back1);

        TextField registrationText = new TextField();
        registrationText.setPrefHeight(50);
        registrationText.setFont(Font.font("Arial", FontWeight.BOLD,16));
        MenuButtonItem registrationButton = new MenuButtonItem("Зарегистрироваться");
        MenuButtonItem back2 = new MenuButtonItem("Назад");
        SubMenu menuRegistration = new SubMenu(registrationText, registrationButton, back2);

        TextField userTextIn = new TextField();
        MenuButtonItem back3 = new MenuButtonItem("Назад");
        MenuButtonItem user = new MenuButtonItem("User1");
        MenuButtonItem user2 = new MenuButtonItem("User2");
        Label userTextOut = new Label();
        SubMenu chatSubMenuText = new SubMenu(userTextIn, userTextOut);
        SubMenuForChat menuChat = new SubMenuForChat(back3, user, user2);

        MenuBox menuBox = new MenuBox(mainMenu);

        back3.setOnMouseClicked(event -> menuBox.setSubMenuDelChat(mainMenu));
        enter.setOnMouseClicked(event -> menuBox.setSubMenuForChat(menuChat, chatSubMenuText));
        login.setOnMouseClicked(event -> menuBox.setSubMenu(menuLogin));
        back1.setOnMouseClicked(event -> menuBox.setSubMenu(mainMenu));
        back2.setOnMouseClicked(event -> menuBox.setSubMenu(mainMenu));
        registration.setOnMouseClicked(event -> menuBox.setSubMenu(menuRegistration));

        exit.setOnMouseClicked(event -> System.exit(0));
        root.getChildren().addAll(menuBox);

        Scene scene = new Scene(root, 900, 600);
        menuBox.setVisible(true);
        primaryStage.setTitle("Чат");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
