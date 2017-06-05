package sample.components;

import javafx.scene.layout.VBox;

public class SubMenuForChat extends VBox {

    public SubMenuForChat(MenuButtonItem...items){
        setSpacing(15);
        setTranslateY(1);
        setTranslateX(10);
        for (MenuButtonItem item: items){
            getChildren().addAll(item);
        }
    }
}
