package fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseButton;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group group = new Group();
		Scene scene = new Scene(group);
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX视频教程第12课，输入框，密码框，标签，实用技术");
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);

		// TextField
//		TextField text = new TextField();
//		TextField text = new LimitedTextField(7);
		TextField text = new PasswordField();
		// text.setText("這是文本");

		text.setLayoutX(100);
		text.setLayoutY(100);

//		text.setPrefSize(220, 100);

//		text.setFont(Font.font(40));

//		text.setStyle(
//                "-fx-background-color:#7ccd7c;" +
//                        "-fx-background-radius:20;"
//        );

		// set Tooltip 提示
		Tooltip tip = new Tooltip("這是提示");
		tip.setFont(Font.font(100));
		text.setTooltip(tip);
		text.setFocusTraversable(false); // 取消焦點
		// 提示
		text.setPromptText("請輸入密碼7個...");

		// limit 7 words
		text.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				if (newValue.length() > 7) {
					text.setText(oldValue);
				}
			}
		});

		text.selectedTextProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				System.out.println(newValue);
			}
		});

		Button bu = new Button("button");
		bu.setOnAction(e -> {
			if (!text.isFocused())
				text.requestFocus(); // 獲得焦點
			// System.out.println("Focus");
		});

		// Label
		Label label = new Label("我是標簽");
		label.setLayoutX(50);
		label.setLayoutY(50);
		label.setOnMouseClicked(e -> {
			if (e.getClickCount() == 2 && e.getButton().equals(MouseButton.PRIMARY))
				System.out.println("mouse clicked 2 " + e.getButton());
		});
		group.getChildren().addAll(text, bu, label);

		primaryStage.show();
	}

}

class LimitedTextField extends TextField {

	private final int limit;

	public LimitedTextField(int limit) {
		this.limit = limit;
	}

	@Override
	public void replaceText(int start, int end, String text) {
		super.replaceText(start, end, text);
		verify();
	}

	@Override
	public void replaceSelection(String text) {
		super.replaceSelection(text);
		verify();
	}

	private void verify() {
		if (getText().length() > limit) {
			setText(getText().substring(0, limit));
			this.positionCaret(limit);
		}

	}
};
