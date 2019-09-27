//JavaFX视频教程第4课，进一步认识stage窗口，模式，模态
package fx.com;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main3 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Stage s1=new Stage();
		Stage s2=new Stage();
		Stage s3=new Stage();
		
		extracted(s1,"s1");
		extracted(s2,"s2");
		extracted(s3,"s3");
		
		
	}

	private void extracted(Stage x,String str) {
		x.setTitle(str);
		if (str.equals("s3")) {
			x.initModality(Modality.APPLICATION_MODAL);
		}
		x.show();
	}

}
