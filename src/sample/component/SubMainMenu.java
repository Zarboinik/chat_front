package sample.component;

import javafx.scene.layout.VBox;
import sample.component.MenuItem;

/**
 * Created by Zarboinik on 23.05.2017.
 */
public class SubMainMenu extends VBox {

    public SubMainMenu(MenuItem...items){
        setSpacing(15);
        setTranslateY(250);
        setTranslateX(350);
        for (MenuItem item: items){
            getChildren().addAll(item);
        }
    }
}
