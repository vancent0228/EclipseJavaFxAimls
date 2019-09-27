//JavaFX视频教程第6课screen类
package fx.com;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Screen screen = Screen.getPrimary();
		double dpi = screen.getDpi();
		Rectangle2D rec1 = screen.getBounds();
		Rectangle2D rec2 = screen.getVisualBounds();
		
		System.out.println("left up x = "+rec1.getMinX()+"    left up y = "+rec1.getMinY());
		System.out.println("right up x = "+rec1.getMaxX()+"    right up y = "+rec1.getMaxY());
		System.out.println("width x = "+rec1.getWidth()+"    height = "+rec1.getHeight());
		System.out.println();
		System.out.println("left up x = "+rec2.getMinX()+"    left up y = "+rec2.getMinY());
		System.out.println("right up x = "+rec2.getMaxX()+"    right up y = "+rec2.getMaxY());
		System.out.println("width x = "+rec2.getWidth()+"    height = "+rec2.getHeight());
		System.out.println();
		System.out.println("DPI = "+dpi);
		
		
		
		
		Platform.exit();
	}

}
