//JavaFX视频教程第3课初步认识stage窗口
package fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("JavaFX");
		primaryStage.getIcons().add(new Image("/icon/javaicon.png"));
		
//		primaryStage.setIconified(true); //最小化
//		primaryStage.setMaximized(true); //最大化
		
//		primaryStage.close(); //關閉窗口
		
//		primaryStage.setWidth(500);
//		primaryStage.setHeight(500);
//		primaryStage.setResizable(false);
		
//		primaryStage.setMaxHeight(1000);
//		primaryStage.setMaxWidth(1000);
//		primaryStage.setMinHeight(100);
//		primaryStage.setMinWidth(100);
		
		primaryStage.heightProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("Height ="+newValue.doubleValue());
				
			}
		});
		primaryStage.widthProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("Width ="+newValue.doubleValue());
				
			}
		});
		
		primaryStage.setFullScreen(true);
		primaryStage.setScene(new Scene(new Group()));
		primaryStage.show();
		
//		System.out.println("height="+primaryStage.getHeight());
//		System.out.println("width="+primaryStage.getWidth());
		
	}

}
