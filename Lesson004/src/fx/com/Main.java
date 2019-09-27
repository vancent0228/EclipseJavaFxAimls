//JavaFX视频教程第4课，进一步认识stage窗口，模式，模态
package fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
//		primaryStage.setOpacity(0.5); //1為不透明 //0為完全透明         值為 1~0之間
		
//		primaryStage.setAlwaysOnTop(true); //永遠置頂
		primaryStage.setWidth(400);
		primaryStage.setHeight(400);

		primaryStage.setX(100);
		primaryStage.setY(100);
		
		primaryStage.xProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("X = "+newValue);
			}
		});
		primaryStage.yProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("Y = "+newValue);
			}
		});
		
		primaryStage.show();
	}

}
