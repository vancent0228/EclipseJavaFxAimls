//JavaFX视频教程第1课，hello world
package fx.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
		System.out.println("HelloWorld");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("JavaFX视频教程第1课，hello world");
		primaryStage.show();
	}
}
