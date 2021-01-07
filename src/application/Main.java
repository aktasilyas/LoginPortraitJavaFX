package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	
	Stage stage;
	@Override
	public void start(Stage primaryStage) {
		this.stage=primaryStage;
		mainMindow();
	}
	
	private void mainMindow() {
		
		
		try {
			FXMLLoader loader=new FXMLLoader(Main.class.getResource("/View/Login.fxml"));
			AnchorPane root=loader.load();
			Scene scene=new Scene(root);
			scene.getStylesheets().addAll(Main.class.getResource("/View/application.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("Portrait Login");
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
