package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SecondScreen {
	Scene scene1;
	Scene scene2;
	Stage stage;
	HomeScreen homescreen;
	Trans trans;
	

public SecondScreen(Stage stage,Trans trans) {
	this.stage=stage;
	this.trans=trans; 
}

public void preparation() {
	Label text = new Label("Enter the amount you want");
	TextField amount = new TextField();
	Button back=new Button("<< Back");
	Button enter = new Button("Enter");
	Label output=new Label ();
	GridPane grid = new GridPane();
	grid.add(text, 1, 0);
	grid.add(amount, 1, 1);
	grid.add(enter, 1, 2);
	grid.add(output, 1, 3);
	grid.add(back,0,2);
	grid.setVgap(5);
	grid.setHgap(5);
	enter.setStyle("-fx-background-color: darkturquoise; -fx-text-fill: navy;");
	back.setStyle("-fx-background-color: darkturquoise; -fx-text-fill: navy;");
	grid.setStyle("-fx-background-color: BEIGE;");
	
	enter.setOnAction(new EventHandler<ActionEvent>()
	{	@Override
		public void handle(ActionEvent event) {			
		int num = Integer.parseInt(amount.getText());
		trans.deposit(num);
		output.setText("Succsseful operation ");
		}
		
	});
	back.setOnAction(new EventHandler<ActionEvent>()
	{
		public void handle(ActionEvent event) {
			stage.setScene(homescreen.getScene());
	}
	}); 
	scene1 = new Scene(grid,400,400);
}
public void prepare() {
	Label text = new Label("Enter the amount you want");
	TextField amount = new TextField();
	Button back=new Button("<< Back");
	Button enter = new Button("Enter");
	Label output=new Label ();
	GridPane grid = new GridPane();
	grid.add(text, 1, 0);
	grid.add(amount, 1, 1);
	grid.add(enter, 1, 2);
	grid.add(output, 1, 3);
	grid.add(back,0,2);
	grid.setVgap(5);
	grid.setHgap(5);
	enter.setStyle("-fx-background-color: darkturquoise; -fx-text-fill: navy;");
	back.setStyle("-fx-background-color: darkturquoise; -fx-text-fill: navy;");
	grid.setStyle("-fx-background-color: BEIGE;");
	
	enter.setOnAction(new EventHandler<ActionEvent>()
	{	@Override
		public void handle(ActionEvent event) {
			//TODO Auto-generated method stub
		
		int num = Integer.parseInt(amount.getText());
		boolean z=trans.withdraw(num);
		if(z) {
		output.setText("Succsseful operation ");}
		else {
			output.setText("Invalid operation ");
		}
		}
		
	});
	back.setOnAction(new EventHandler<ActionEvent>()
	{
		public void handle(ActionEvent event) {
			stage.setScene(homescreen.getScene());
	}
	}); 
	
	scene2= new Scene(grid,400,400);
	
	}

public Scene getScene1() {
	return scene1;
}

public Scene getScene2() {
	return scene2;
}
public void setHomeScreen(HomeScreen homescreen) {
	this.homescreen=homescreen;
}
}