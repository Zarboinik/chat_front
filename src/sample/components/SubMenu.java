package sample.components;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SubMenu extends VBox {

    public SubMenu(MenuButtonItem...items){
        setSpacing(15);
        setTranslateY(250);
        setTranslateX(350);
        for (MenuButtonItem item: items){
            getChildren().addAll(item);
        }
    }

    public SubMenu(TextField textField, MenuButtonItem item1, MenuButtonItem item2){
        setSpacing(15);
        setTranslateY(250);
        setTranslateX(350);
        getChildren().addAll(textField,item1,item2);
    }

    public SubMenu(TextField textField, Label label){
        setSpacing(15);

        textField.setPrefHeight(30);
        textField.setPrefWidth(300);
        textField.setTranslateX(350);
        textField.setTranslateY(5);
        textField.setFont(Font.font("Arial", FontWeight.BOLD,16));

        label.setText("входящий текст пользователя");
        label.setPrefHeight(500);
        label.setPrefWidth(300);
        label.setTranslateX(350);
        label.setTranslateY(50);
        getChildren().addAll(label,textField);
    }
}
