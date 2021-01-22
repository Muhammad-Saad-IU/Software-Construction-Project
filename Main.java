

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button bt=new Button("BST");
		bt.setMinSize(100,60);
	    bt.setStyle("-fx-background-color: green");
	    bt.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		bt.setOnAction(new EventHandler<ActionEvent>() {
			
		
			public void handle(ActionEvent arg0) {
				BstSDI s=new BstSDI ();
				s.start(primaryStage);
				
			}
		});
		Image image1=new Image("file:binary-search-trees-javascript.png");
		ImageView im=new ImageView(image1);
		GridPane g=new GridPane();
		//g.setPadding(new Insets(60,60,90,90));
		
		g.add(im, 0,0);
		g.add(bt, 0, 7);
		// g.setAlignment(Pos.CENTER_RIGHT);
		 
		 g.setStyle("-fx-background-color:Yellow");
		/*
		 * HBox hb=new HBox(); hb.getChildren().add(bt);
		 */
		Scene scene=new Scene(g,400,400,Color.RED);
		primaryStage.setScene(scene);
		primaryStage.show();
		 Alert alert = new Alert(Alert.AlertType.INFORMATION, "This is a data-tree animation created by Muhammad Saad 43656!", ButtonType.OK);
		 alert.getDialogPane().setMinHeight(80);
	        alert.show();
	     Alert alert1 = new Alert(Alert.AlertType.INFORMATION, "Click on the BST to begin!", ButtonType.OK);
	     alert1.getDialogPane().setMinHeight(80);
		    alert1.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
