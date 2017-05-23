package sample.component;

import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.Rectangle;


/**
 * Created by Zarboinik on 23.05.2017.
 */
public class MenuBox extends Pane {
    static SubMainMenu subMainMenu;

    public MenuBox(SubMainMenu subMainMenu){
        MenuBox.subMainMenu = subMainMenu;

        setVisible(false);
        Rectangle bg = new Rectangle(900, 600,Color.LIGHTBLUE);
        bg.setOpacity(0.4);
        getChildren().addAll(bg, subMainMenu);
    }

    public void setSubMenu(SubMainMenu subMainMenu){
        getChildren().remove(MenuBox.subMainMenu);
        MenuBox.subMainMenu = subMainMenu;
        getChildren().add(subMainMenu);
    }
}
