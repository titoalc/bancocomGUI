package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Cliente;
import model.Conta;

public class TelaCadastroDepositarRetirar { public VBox getTelaDepositarRetirar(Stage stage) {
    Conta conta = new Conta(123, 10.0);
    Cliente cliente = new Cliente("Thieres", "13", conta);
    MenuBarView menuBarView = new MenuBarView();
    MenuBar menuBar = menuBarView.getMenuBar(stage);
    VBox raiz = new VBox(10);

    Label numeroConta = new Label("conta" + cliente.getConta().getNumero());
    Label numeroConta2 = new Label("nome: " + cliente.getNome());

    TextField valorTransacao = new TextField();

    Button btnDepositar = new Button("depositar");
    Button btnRetirar = new Button("retirar");

    Label saldoConta = new Label("saldo: " + cliente.getConta().getSaldo());


    raiz.getChildren().addAll(menuBar, numeroConta, numeroConta2, valorTransacao, btnDepositar, btnRetirar, saldoConta);

    btnDepositar.setOnAction(event -> {
        conta.depositar(Double.valueOf(valorTransacao.getText()));
        saldoConta.setText("saldo: " + cliente.getConta().getSaldo());
    });

    btnRetirar.setOnAction(event -> {
        conta.retirar(Double.valueOf(valorTransacao.getText()));
        saldoConta.setText("saldo: " + cliente.getConta().getSaldo());
    });
    return raiz;
}
}
