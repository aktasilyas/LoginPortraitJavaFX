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
    private ImageView ýmage;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		RotateTransition rotateTransition=new RotateTransition(Duration.seconds(45),ýmage);
		rotateTransition.setByAngle(9*360);
		rotateTransition.play();
		
	}

}
