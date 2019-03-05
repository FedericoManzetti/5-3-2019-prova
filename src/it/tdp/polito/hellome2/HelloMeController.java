package it.tdp.polito.hellome2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloMeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private Button btnCiao;

    @FXML
    private TextArea txtResult;

    @FXML
    void handleCiao(ActionEvent event) {
    	String nome= txtNome.getText();
    	if(nome.length()==0)
    	   txtResult.setText("Errore, inserire un nome valido!");
    	else {
    		String risultato = "Benvenuto "+nome+"\n";
    	
    	txtResult.setText(risultato);
    }
    	}
    

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'HelloMe.fxml'.";
        assert btnCiao != null : "fx:id=\"btnCiao\" was not injected: check your FXML file 'HelloMe.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'HelloMe.fxml'.";

    }
}
