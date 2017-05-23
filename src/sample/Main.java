package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.component.MenuBox;
import sample.component.MenuItem;
import sample.component.SubMainMenu;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = new Pane();
        Image image = new Image(getClass().getResourceAsStream("chat.jpg"));
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(900);
        root.getChildren().add(img);

        MenuItem login = new MenuItem("Авторизация");
        MenuItem registration = new MenuItem("Регистрация");
        MenuItem exit = new MenuItem("Выход");
        SubMainMenu mainMenu = new SubMainMenu(login,registration,exit);
        MenuBox menuBox = new MenuBox(mainMenu);


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
