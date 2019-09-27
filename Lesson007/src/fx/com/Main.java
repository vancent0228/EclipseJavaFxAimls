//JavaFX视频教程第7课 scene类，和两个小知识
package fx.com;

import java.net.URL;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// open web
		HostServices host = getHostServices();
		host.showDocument("www.youtube.com");
		
		// TODO Auto-generated method stub
		URL url = getClass().getClassLoader().getResource("icon/javaIcon.png");
		String path = url.toExternalForm();
		
		Button button = new Button("BUTTON");
		button.setPrefWidth(200);
		button.setPrefHeight(200);
		button.setCursor(Cursor.OPEN_HAND);
		
		Group group = new Group();
		group.getChildren().addAll(button);
		
		Scene scene = new Scene(group);
		scene.setCursor(Cursor.cursor(path));
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("JavaFX 007");
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
	}


}
