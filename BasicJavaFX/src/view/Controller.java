package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

public class Controller {

	@FXML
	ImageView forestview;
	@FXML
	Button btnBlur;
	@FXML
	Button btnCancel;
		
	@FXML
	public void cambiarFondo() {
		System.out.println("jkfhs");
		forestview.setEffect(new GaussianBlur(10));
	}
	
	@FXML
	public void finish() {
		System.exit(0);
	}
}