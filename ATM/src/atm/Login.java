package atm;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;

public class Login {
	 Trans trans; 
	 Scene scene;
	 HomeScreen homescreen;
	 Stage stage;
	 
	 public Login (Stage stage ) {
		 this.stage=stage;
	 }
		
	public void preparation() {
		
			trans=new Trans();
			
			Label card_numberLabel = new Label ("Card number");
			PasswordField card_numberField = new PasswordField();
			Button submit = new Button(" Submit");
			Label validationlabel=new Label ();
			
			GridPane grid= new GridPane();
			grid.add(card_numberLabel,1,0);	
			grid.add(card_numberField,1,1);
			grid.add(submit,1,2);
			grid.add(validationlabel,1,3);
			card_numberLabel.setStyle("-fx-font: normal bold 20px 'serif' "); 
			submit.setStyle("-fx-background-color: darkturquoise; -fx-text-fill: navy;");
			grid.setStyle("-fx-background-color: BEIGE;");
			
			submit.setOnAction(new EventHandler<ActionEvent>() {
				public void handle (ActionEvent event) {
					String card_number= card_numberField.getText();
				
						boolean valid = trans.validation(card_number);
					if (valid) {
						validationlabel.setText("Welcome");
						stage.setScene(homescreen.getScene());
					}
					else {
						validationlabel.setText("Wrong password, please try again");
						}
				}
			});
			 scene = new Scene(grid , 400 , 400);
			}
		public Scene getScene() {
			return this.scene;
		}
		public void setHomeScreen(HomeScreen homescreen) {
			this.homescreen=homescreen;
		}
}
