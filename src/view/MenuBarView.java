package view;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuBarView {
    public MenuBar getMenuBar(Stage stage) {
    // menu bar vai receber o palco de parametro
    MenuBar menuBar = new MenuBar();
    // barra de menu

    Menu cadastrar = new Menu("cadastrar");
    //criou o menu com itens e subitens. adicionou o texto menu cadastrar na barra de menu

    Menu operacoes = new Menu("operações");
    // criou o menu operacoes com o texto operações

    Menu sobre = new Menu("sobre");



    MenuItem cadastrarCliente = new MenuItem("Cliente");
    // criou  um item com o nome cadastrarcliente dentro do menu cadastrar com o texto cliente

    MenuItem operacoesCliente = new MenuItem("depositar/retirar");
    // criou o item operacoes cliente dentro do menu operacoes com o texto depositar/retirar

    MenuItem desenvolvimento = new MenuItem("sobre");

    MenuItem produto = new MenuItem("produto");

    MenuItem funcionarios = new MenuItem("funcionarios");

    cadastrar.getItems().addAll(cadastrarCliente,produto,funcionarios);
    //adicinou o item cadastrar cliente no menu cadastrar
    operacoes.getItems().addAll(operacoesCliente);
    // menu operacoes adicionou o item operacoesCliente
    sobre.getItems().addAll(desenvolvimento);





    menuBar.getMenus().addAll(cadastrar, operacoes, sobre);
    // a barra de menu adicionou o menu cadastrar e o menu operacoes

    cadastrarCliente.setOnAction(event -> {
        stage.setTitle("Cadastrar Cliente");
        //abrir a tela de cadastro cliente
        stage.setTitle("cadastar cliente");
        //adicionou o titulo cadastrar cliente
        TelaCadastroClienteView telaCadastroClienteView =
            new TelaCadastroClienteView();
        stage.setScene(new Scene(telaCadastroClienteView.getTelaCadastroCliente(stage), 500, 275));
        stage.show();
    });

    operacoesCliente.setOnAction(event -> {
        stage.setTitle("depositar/retirar");
        stage.setTitle("depositar/retirar");
        TelaCadastroDepositarRetirar telaCadastroDepositarRetirar =
                new TelaCadastroDepositarRetirar();
        stage.setScene(new Scene(telaCadastroDepositarRetirar.getTelaDepositarRetirar(stage), 500, 275));
        stage.show();
    });
    sobre.setOnAction(event -> {
        stage.setTitle("sobre");
        TelaSobre telaSobre = new TelaSobre();
        stage.setScene(new Scene(telaSobre.getTelaSobre(stage), 500, 275));
        stage.show();
    });
    produto.setOnAction(event -> {
        stage.setTitle("produto");
        TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
        stage.setScene(new Scene(telaCadastroProduto.getTelaProduto(stage),500,275));
        stage.show();
    });

    funcionarios.setOnAction(event -> {
        stage.setTitle("funcionarios");
        TelaCadastroFuncionarios telaCadastroFuncionarios = new TelaCadastroFuncionarios();
        stage.setScene(new Scene(telaCadastroFuncionarios.getTelaCadastrarFuncionarios(stage),500,275));
        stage.show();
    });



    return menuBar;


}
}
