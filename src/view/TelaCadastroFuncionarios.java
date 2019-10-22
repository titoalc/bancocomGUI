package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Funcionarios;

public class TelaCadastroFuncionarios {public VBox getTelaCadastrarFuncionarios(Stage stage){
    VBox raiz = new VBox(10);
    // onde será exibida as cenas
    MenuBarView menuBarView = new MenuBarView();
    Label nome = new Label("nome");
    // texto que será exibido
    TextField nomeFuncionario = new TextField();
    // texto que será digitado
    Label area = new Label("area");
    TextField areaFuncionario = new TextField();
    Label codigo = new Label("codigo");
    TextField codigoFuncionario = new TextField();
    Label lider = new Label("lider");
    TextField liderFuncionario = new TextField();
    Button BtnFuncionarios = new Button("cadastrar");
    Button BtnLimpar = new Button("limpar");
    Label cadastroComSucesso = new Label("");
    MenuBarView menuBarView1 = new MenuBarView();
    MenuBar menuBar = menuBarView1.getMenuBar(stage);

    BtnFuncionarios.setOnAction(event -> {
        Funcionarios funcionarios = new Funcionarios(nomeFuncionario.getText(), (areaFuncionario.getText()), Double.valueOf(codigoFuncionario.getText()), liderFuncionario.getText());
        cadastroComSucesso.setText("cadastrado com sucesso! ");
        System.out.println(funcionarios);
        limparCadastroCliente(nomeFuncionario,areaFuncionario,codigoFuncionario,liderFuncionario);


    });

    BtnLimpar.setOnAction(event ->{
        limparCadastroCliente(nomeFuncionario, areaFuncionario, codigoFuncionario, liderFuncionario);
        cadastroComSucesso.setText("");
    });
    raiz.getChildren().addAll(menuBar,cadastroComSucesso,nome,nomeFuncionario,area,areaFuncionario,codigo,codigoFuncionario,lider,liderFuncionario,BtnFuncionarios,BtnLimpar);
    return raiz;

}
    private void limparCadastroCliente(TextField nomeFuncionario, TextField areaFuncionario, TextField codigoFuncionario, TextField liderFuncionario) {
        nomeFuncionario.setText("");
        areaFuncionario.setText("");
        codigoFuncionario.setText("");
        liderFuncionario.setText("");
    }
}
