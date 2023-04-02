package application;

import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class Appmain extends Application 
 {

	public Appmain() {
		System.out.println(Thread.currentThread().getName()+": AppMain() 호출");
	} // java ui 관련은 application에서만 해야함. 다른장소에 코드를 넣으면안됨.

	
	@Override
	 public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+": init() 호출"); 
		Parameters params = this.getParameters();
		Map<String,String> map =params.getNamed();
		String ip = map.get("ip");
		String port = map.get("Port");
		System.out.println("IP:" +ip);
		System.out.println("Port :"+port);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
	System.out.println(Thread.currentThread().getName()+": start() 호출");
	
	}
	
	@Override
	public void stop() throws Exception{
	System.out.println(Thread.currentThread().getName()+": stop() 호출");
	
	}
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+": main() 호출");
		launch(args);

	}

}
