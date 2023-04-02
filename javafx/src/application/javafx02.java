package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class javafx02 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		VBox root = new VBox();   //Parent 하위객체인 VBox생성
		root.setPrefWidth(350);   //VBox의 폭설정
		root.setPrefHeight(150);  //VBox의 높이 설정
		root.setAlignment(Pos.CENTER); // 컨트롤을 중앙으로 정렬 
		root.setSpacing(20);	// 컨트롤의 수직간격

		Label label = new Label(); //Label 컨트롤생성
		label.setText("테스트");     //text속성설정
		label.setFont(new Font(50));  //font 속성설정
		
		Button button = new Button();
		button.setText("확인");
		button.setOnAction(event->Platform.exit());  //클릭이벤트처리  클릭하면 종료.
		
		root.getChildren().add(label);   //VBox의 자식으로 Label컨트롤추가
		root.getChildren().add(button);  //VBox의 자식으로 Button 컨트롤추가
		
		Scene scene = new Scene(root);  //VBox를 루트 컨테이너로 해서 Scene생성
		
		primaryStage.setTitle("JAVAFXTEST"); //JAVAFX 제목설정
		primaryStage.setScene(scene); //윈도우에 장면설정
		
		
		primaryStage.show();			 //윈도우보여주기
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
