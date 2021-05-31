package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private TextField tfTexto;

    @FXML
    private TextArea taTexto;

    @FXML
    private Label lblMsn;

    @FXML
    private Button btnInserir;

    @FXML
    private Button btnClean;

    @FXML
    private ComboBox<String> cbTexto;

    @FXML
    private CheckBox chkAtivo;


    public void initialize() {
        this.cbTexto.getItems().addAll("Laranja", "Vermelho", "Azul", "Verde", "Amarelo");

    }

    @FXML
    void inserir(ActionEvent event) {

        if (this.chkAtivo.isSelected()) {
            this.taTexto.appendText(this.cbTexto.getValue() + "\n");
        } else {
            this.lblMsn.setText("");
            if (!this.tfTexto.getText().isEmpty() && this.tfTexto.getText() != null) {
                this.taTexto.appendText(this.tfTexto.getText() + "\n");
                lblMsn.setText("Introduzido com sucesso.");
                this.tfTexto.clear();
            } else {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setHeaderText(null);
                alerta.setTitle("ERRO!");
                alerta.setContentText("Não pode adicionar valores nulos...");
                alerta.showAndWait();
            }
        }

    }

    @FXML
    void limpar(ActionEvent event) {
        this.tfTexto.clear();
        this.taTexto.clear();
        this.lblMsn.setText("");
    }

}
