//JavaFX视频教程第2课，application的启动方式和生命周期
package fx.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(Main2.class,args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("這是start方法");
	}

}
