//JavaFX视频教程第8课Group容器的使用
package fx.com;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button b1 = new Button("b1");
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");

		b1.setLayoutX(10);
		b1.setLayoutY(10);
		b1.setPrefWidth(50);
		b1.setPrefHeight(50);

		b2.setLayoutX(210);
		b2.setLayoutY(10);
		b2.setPrefWidth(50);
		b2.setPrefHeight(50);

		b3.setLayoutX(410);
		b3.setLayoutY(10);
		b3.setPrefWidth(50);
		b3.setPrefHeight(50);

		Group group = new Group();
		group.getChildren().addAll(b1, b2, b3);

		// addListener
		group.getChildren().addListener(new ListChangeListener<Node>() {

			@Override
			public void onChanged(Change<? extends Node> c) {
				// TODO Auto-generated method stub
				System.out.println("size() = "+c.getList().size());
			}
		});

//		group.setOpacity(0.5); //effect all group
//		group.setCursor(Cursor.OPEN_HAND);

		// get all object
		Object[] obj = group.getChildren().toArray();
//		System.out.println("obj.length="+obj.length);
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Button) {
				Button bu = (Button) obj[i];
				bu.setPrefWidth(100);
				bu.setPrefHeight(100);
			}
		}
		
		//OnAction
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Button b4=new Button("B4");
				group.getChildren().add(b4);
			}
		});

		// group.contains
		// System.out.println(group.contains(10, 10));

		// set autoSize default value true
//		group.setAutoSizeChildren(false);

		// clear all
//		group.getChildren().clear();

		// remove nodes
//		group.getChildren().removeAll(b1,b3);

		Scene scene = new Scene(group);

		primaryStage.setScene(scene);

		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setTitle("JavaFX 008");
		primaryStage.show();
	}

}
