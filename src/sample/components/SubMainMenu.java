package sample.components;

import javafx.scene.layout.VBox;

public class SubMainMenu extends VBox {

    public SubMainMenu(MenuButtonItem...items){
        setSpacing(15);
        setTranslateY(250);
        setTranslateX(350);
        for (MenuButtonItem item: items){
            getChildren().addAll(item);
        }
    }
}
