package view;

import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaSobre { public VBox getTelaSobre(Stage stage) {
    VBox raiz = new VBox(10);
    MenuBarView menuBarView = new MenuBarView();
    // variavel menuBarView MenuBarView classe fabrica //
    MenuBar menuBar = menuBarView.getMenuBar(stage);
    Label sobre = new Label("desenvolvido por thieres");



    raiz.getChildren().addAll(menuBar, sobre);
    return raiz;
}
}
