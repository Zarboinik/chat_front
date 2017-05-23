package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.components.MenuBox;
import sample.components.MenuButtonItem;
import sample.components.SubMainMenu;

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
        SubMainMenu mainMenu = new SubMainMenu(login,registration,exit);

        MenuButtonItem loginHere = new MenuButtonItem("Здесь будет ввод текста");
        MenuButtonItem enter = new MenuButtonItem("Вход");
        MenuButtonItem back1 = new MenuButtonItem("Назад");
        SubMainMenu menuLogin = new SubMainMenu(loginHere, enter, back1);

        MenuButtonItem registrHere = new MenuButtonItem("текст для регистрации");
        MenuButtonItem registrationButton = new MenuButtonItem("Зарегистрироваться");
        MenuButtonItem back2 = new MenuButtonItem("Назад");
        SubMainMenu menuRegistration = new SubMainMenu(registrHere, registrationButton, back2);

        MenuBox menuBox = new MenuBox(mainMenu);
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
