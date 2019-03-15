package atm;

import javafx.application.Application;
import javafx.stage.Stage;

public class ATM extends Application {

	
public static void main(String[] args) {
	launch(args);

}
	
	public void start(Stage primaryStage)throws Exception {
		Trans x= new Trans();
		primaryStage.setTitle("Login");
		
		Login login=new Login(primaryStage);
		HomeScreen homescreen=new HomeScreen(primaryStage,x);
		SecondScreen secondscreen=new SecondScreen(primaryStage,x);
		
		login.preparation();
		homescreen.preparation();
		secondscreen.preparation();
		secondscreen.prepare();
		
		login.setHomeScreen(homescreen);
		secondscreen.setHomeScreen(homescreen);
		homescreen.setSecondScreen(secondscreen);
		primaryStage.setScene(login.getScene());
		primaryStage.show();
	}
}


