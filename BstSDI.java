

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;



public class  BstSDI extends Application {
    private static ArrayList<Integer> nodes = new ArrayList<>();
   
    public void start(Stage primaryStage){
        BST<Integer> tree = new BST<>();
       
        BorderPane pane = new BorderPane();
        BstPane view = new BstPane(tree);
        
        //TO set the Pane
        pane.setCenter(view);
        TextField textField = new TextField();
        textField.setPrefColumnCount(3);
        textField.setAlignment(Pos.BASELINE_RIGHT);
        Button insert = new Button("Insert");
        Button delete = new Button("Delete");
        Button search = new Button("Search");
        Button height = new Button("Height");
       
        // Insert and delete button
        insert.setOnAction(e->{
            if(textField.getText().length() == 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "You haven't entered anything!", ButtonType.OK);
                alert.getDialogPane().setMinHeight(80);
                alert.show();
            }
            else {
                int key = Integer.parseInt(textField.getText());
                nodes.add(key);
                if (tree.search(key)) {
                    view.displayTree();
                    view.getChildren().add(new Text(20, 20, key + "is already present!"));
                } else {
                    tree.insert(key);
                    view.displayTree();
                    view.getChildren().add(new Text(20, 20, key +" is inserted!"));
                }
                textField.clear();
            }
        });
        search.setOnAction(e->{
            if(textField.getText().length() == 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "You haven't entered anything!", ButtonType.OK);
                alert.getDialogPane().setMinHeight(80);
                alert.show();
            }
            else {
                int key = Integer.parseInt(textField.getText());
                nodes.add(key);
                if (tree.search(key)) {
                    view.displayTree();
                    view.getChildren().add(new Text(40, 40, key +" the value is present in tree !"));
                } 
                else {
                	Alert alert = new Alert(Alert.AlertType.INFORMATION, "The value is not present in tree!", ButtonType.OK);
                    alert.getDialogPane().setMinHeight(80);
                    alert.show();
                }
                textField.clear();
            }
        });

        height.setOnAction(e->{
            int key = Integer.parseInt(textField.getText());
           
            textField.clear();
        });

        delete.setOnAction(e->{
            int key = Integer.parseInt(textField.getText());
            if(!tree.search(key)){
                view.displayTree();
                
                view.getChildren().add(new Text(20, 20, key +"Tree is not Present in the Binary Tree"));
            }
            else{
                tree.delete(key);
                view.displayTree();
                view.getChildren().add(new Text(20, 20,key + "is replaced by its predecessor and is deleted!"));
            }
            textField.clear();
        });
      //Adding functionalties
        
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("Enter a value"), textField, insert, delete,search);
        hBox.setAlignment(Pos.BASELINE_CENTER);
        pane.setTop(hBox);
        // to set the stage
        pane.setStyle("-fx-background-color:BLUEVIOLET");
        Scene scene = new Scene(pane, 700,800,Color.BLUEVIOLET);
        primaryStage.setTitle("Binary search tree Bst visulaiser");
		/* primaryStage.getIcons().add(new Image("file:data/tree.png")); */
        primaryStage.setScene(scene);
        primaryStage.show();
        //stage
        Alert alert = new Alert(Alert.AlertType.INFORMATION,".THis is a Bst visualization created Muhammad Saad 43656", ButtonType.OK);
 
        alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
        alert.show();
    }

   

 
  
}