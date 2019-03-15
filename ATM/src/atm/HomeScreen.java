package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class HomeScreen {
	Stage stage;
	Login login;
	Scene scene;
	ATM code;
	Trans trans;
	SecondScreen secondscreen;

	public HomeScreen(Stage stage,Trans trans) {
		this.stage=stage;
		this.trans=trans;
	}

public void preparation() {
	Label welcome =new Label("Welcome!");
	Label b =new Label();
	Button deposit = new Button(" Deposit");
	Button withdraw = new Button(" Withdraw");
	Button inquiry = new Button(" Inquiry");
	Button next = new Button(" Next");
	Button previous = new Button(" Previous");
	Label show1= new Label();
	
	
	GridPane grid= new GridPane();
	grid.add(welcome,1,0);
	grid.add(b,1,2);
	grid.add(deposit,1,3);
	grid.add(withdraw,1,4);
	grid.add(inquiry,1,5);
	grid.add(next,2,2);
	grid.add(previous,0,2);
	grid.add(show1,0 ,7);
	grid.setVgap(10);
	grid.setHgap(10);
	welcome.setStyle("-fx-font: normal bold 20px 'serif';-fx-text-fill: royalblue; "); 
	deposit.setStyle("-fx-background-color: darkturquoise; -fx-text-fill: navy;");
	withdraw.setStyle("-fx-background-color: darkturquoise; -fx-text-fill: navy;");
	inquiry.setStyle("-fx-background-color: darkturquoise; -fx-text-fill: navy;");
	next.setStyle("-fx-background-color: royalblue; -fx-text-fill:white;");
	previous.setStyle("-fx-background-color: royalblue; -fx-text-fill: white;");
	grid.setStyle("-fx-background-color: BEIGE;");
	grid.setAlignment(Pos.CENTER);
	
	deposit.setOnAction(new EventHandler<ActionEvent>()
	{
		@Override
		public void handle(ActionEvent event) {
			stage.setScene(secondscreen.getScene1());
		}
		
	});
	withdraw.setOnAction(new EventHandler<ActionEvent>()
	{	@Override
		public void handle(ActionEvent event) {
			stage.setScene(secondscreen.getScene2());
		}
		
	});
	inquiry.setOnAction(new EventHandler<ActionEvent>()
	{	@Override
		public void handle(ActionEvent event) {
		int x = trans.getBalance();
		b.setText("your balance is "+String.valueOf(x));
			
		}
		
	});
	next.setOnAction(new EventHandler<ActionEvent>()
	{	@Override
		public void handle(ActionEvent event) {
			show1.setText(trans.nextB());
		}
		
	});
	previous.setOnAction(new EventHandler<ActionEvent>()
	{	@Override
		public void handle(ActionEvent event) {
		show1.setText(trans.previousB());
		}
	});
		scene = new Scene(grid,400,400);
}
public Scene getScene() {
	return scene;
}
public void setLogin(Login login) {
	this.login=login;
}
public void setSecondScreen(SecondScreen secondscreen) {
	this.secondscreen=secondscreen;
}
}
