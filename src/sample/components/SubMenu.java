package sample.components;

import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

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
}
