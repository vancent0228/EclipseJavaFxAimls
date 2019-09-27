//JavaFX视频教程第5课platform类的使用
package fx.com;

import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// Platform.setImplicitExit(false);
		System.out.println(Platform.isSupported(ConditionalFeature.SCENE3D));
		System.out.println(Platform.isSupported(ConditionalFeature.FXML));
		primaryStage.show();
		// Platform.exit();

	}

}
