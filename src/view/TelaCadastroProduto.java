package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Produto;

public class TelaCadastroProduto {public VBox getTelaProduto(Stage stage) {
    VBox raiz = new VBox(10);
    MenuBarView menuBarView = new MenuBarView();
    MenuBar menuBar = menuBarView.getMenuBar(stage);
    Label nome = new Label("nome: ");
    TextField nomeProduto = new TextField();
    Label preco = new Label("preço: ");
    TextField precoProduto = new TextField();
    Button cadastrar = new Button("cadastrar");
    Button limpar = new Button("limpar");


    cadastrar.setOnAction(event -> {
        Produto produto = new Produto(nomeProduto.getText(),Double.valueOf(precoProduto.getText()));

        System.out.println(produto);

    });
    limpar.setOnAction(event -> {
        nomeProduto.setText("");
        precoProduto.setText("");
    });{

    }
    raiz.getChildren().addAll(menuBar,nome,nomeProduto,preco,precoProduto,cadastrar,limpar);
    return raiz;
}
}
