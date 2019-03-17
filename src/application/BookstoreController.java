package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;

public class BookstoreController {
	
	
	
	@FXML
	private TextArea txtEntrada;
	@FXML
	private TextArea txtSalida;
	@FXML
	private Button  btEjecutar;
	@FXML
	private TabPane tabBookstore;
	@FXML
	private Tab tabBaseCase;
	@FXML
	private Tab tabOtherCase;
	
	
	private String resultado;
	
	public void init() {}
	
	@FXML
	public void sendBaseCase(ActionEvent e) {
		
		String casoBase = txtEntrada.getText();
		String ruta = "src/files/baseCase.txt";
		File archivo = new File(ruta);
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
			bw.write(casoBase);
			bw.close();
		} catch (IOException m) {
			// TODO Auto-generated catch block
			m.printStackTrace();
		}
		txtSalida.setText("Hola, ya funciona.");
	}
	
	
//	public String finalMessage(ActionEvent e) {
//		
//	}
	
	
}
