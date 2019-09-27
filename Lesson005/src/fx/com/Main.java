//JavaFX视频教程第5课platform类的使用
package fx.com;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("runLater up = " + Thread.currentThread().getName());

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("RUN.... = " + Thread.currentThread().getName());

				int i = 1;
				while (i < 10) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("i = " + i);
					
					i = i + 1;
				}
			}
		});

		System.out.println("runLater down = " + Thread.currentThread().getName());
		primaryStage.show();
	}

}
