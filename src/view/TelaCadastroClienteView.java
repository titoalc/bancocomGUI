package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Cliente;
import model.Conta;

public class TelaCadastroClienteView {
    public VBox getTelaCadastroCliente(Stage Stage) {
        VBox raiz = new VBox(10);

        Label nome = new Label("nome: ");
        // informação nome exibido na tela
        TextField nomeCliente = new TextField();
        // onde o usuario irá inserir o nome
        Label cpf = new Label("cpf: ");
        // texto cpf exibido na tela
        TextField cpfCliente = new TextField();
        // onde o usuario digita o cpf
        Label numconta = new Label("conta: ");


        TextField contaCliente = new TextField();

        Button btnCadastrar = new Button("cadastrar");
        // botão cadastrar //
        Button btnLimpar = new Button("Limpar");

        MenuBarView menuBarView = new MenuBarView();
        // pegou o menu bar view da classe get menubarview tornando ela public //
        MenuBar menuBar = menuBarView.getMenuBar(Stage);


        raiz.getChildren().addAll(  menuBar, nome, nomeCliente, cpf, cpfCliente, numconta, contaCliente, btnCadastrar, btnLimpar);
        // o palco onde sera exibido
        btnCadastrar.setOnAction(Event -> {
            Conta conta = new Conta(Integer.valueOf(contaCliente.getText()), 0.0);

            Cliente cliente = new Cliente(nomeCliente.getText(), cpfCliente.getText(), conta);


            // caracteristicas do botão objeto conta e objeto cliente armazenados
            System.out.println(cliente);
        });

        btnLimpar.setOnAction(event -> {
            contaCliente.setText("");
            nomeCliente.setText("");
            cpfCliente.setText("");
        });
        return raiz;
    }
}
