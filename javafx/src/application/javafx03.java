package application;




import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class javafx03 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		HBox hbox = new HBox();   //Parent 하위객체인 HBox생성
	    hbox.setPadding(new Insets(10)); // 안쪽 여백 설정
	    hbox.setSpacing(10); //컨트롤 간의 수평 간격설정
	
	    javafx.scene.control.TextField textField = new TextField();// TextField컨트롤생성
	    textField.setPrefWidth(200); //TextField의 폭설정
		
	    Button button = new Button();   //button 컨트롤 생성
	    button.setText("확인");			//button 글자설정
	    
	    ObservableList list = hbox.getChildren(); 	//HBox의 ObservableList얻기
	    list.add(textField);						//TextField 컨트롤 배치
	    list.add(button);							//button의 컨트롤 배치
	    
	    Scene scene = new Scene(hbox); 				//장면생성
	    
		primaryStage.setTitle("appmain"); //JAVAFX 제목설정
		primaryStage.setScene(scene); //윈도우에 장면설정			
		primaryStage.show();			 //윈도우보여주기
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
