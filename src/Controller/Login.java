package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Login implements Initializable{
    @FXML
    private ImageView �mage;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		RotateTransition rotateTransition=new RotateTransition(Duration.seconds(45),�mage);
		rotateTransition.setByAngle(9*360);
		rotateTransition.play();
		
	}

}
