//JavaFX视频教程第2课，application的启动方式和生命周期
package fx.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main4 extends Application {

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init - "+Thread.currentThread().getName());
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
		System.out.println("stop - "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("main - "+Thread.currentThread().getName());
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("start - "+Thread.currentThread().getName());
		primaryStage.show();
	}
}
