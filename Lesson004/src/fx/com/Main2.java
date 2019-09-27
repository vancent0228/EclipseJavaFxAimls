//JavaFX视频教程第4课，进一步认识stage窗口，模式，模态
package fx.com;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Stage s[]=new Stage[5];
		
		StageStyle ss[]= {
				StageStyle.DECORATED,
				StageStyle.TRANSPARENT,
				StageStyle.UNDECORATED,
				StageStyle.UNIFIED,
				StageStyle.UTILITY
				};
		
		for (int i = 0; i < s.length; i++) {
			s[i]=new Stage();
			s[i].initStyle(ss[i]);
			s[i].setTitle("Stage"+(i+1));
			s[i].show();
		}

	}

}
