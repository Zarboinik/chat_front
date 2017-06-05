package sample.components;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MenuBox extends Pane {
    static SubMenu subMenu;
    static SubMenuForChat subMenuForChat;

    public MenuBox(SubMenu subMenu){
        MenuBox.subMenu = subMenu;

        setVisible(false);
        Rectangle bg = new Rectangle(900, 600,Color.LIGHTBLUE);
        bg.setOpacity(0.4);
        getChildren().addAll(bg, subMenu);
    }

    public void setSubMenu(SubMenu subMenu){
        getChildren().remove(MenuBox.subMenu);
        MenuBox.subMenu = subMenu;
        getChildren().add(subMenu);
    }

    public void setSubMenuForChat(SubMenuForChat subMenuForChat, SubMenu subMenu){
        getChildren().remove(MenuBox.subMenu);
        MenuBox.subMenuForChat = subMenuForChat;
        MenuBox.subMenu = subMenu;
        getChildren().addAll(subMenuForChat, subMenu);
    }

    public void setSubMenuDelChat(SubMenu subMenu){
        getChildren().removeAll(MenuBox.subMenuForChat, MenuBox.subMenu);
        MenuBox.subMenu = subMenu;
        getChildren().add(subMenu);
    }
}
