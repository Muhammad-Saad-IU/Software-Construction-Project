

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;


public class BstPane extends Pane {
    private BST<Integer> tree;
    private double radius = 25;
    private double vGap = 40;

     BstPane(){ }

    BstPane(BST<Integer> tree){
        this.tree = tree;
        getChildren().add(new Text(20, 20, "Tree is empty"));
        }

   

     public void displayTree(){
        this.getChildren().clear();
        if(tree.getRoot() != null){
            displayTree(tree.getRoot(), getWidth() / 2, vGap, getWidth() / 4, Color.CHOCOLATE);
        }
    }

    protected void displayTree(TreeNode<Integer> root, double x, double y, double hGap, Color color){
        if(root.left != null){
            getChildren().add(new Line(x - hGap, y + vGap, x, y));
            displayTree(root.left, x - hGap, y + vGap, hGap / 2,color);
        }

        if (root.right != null){
            getChildren().add(new Line(x + hGap, y + vGap, x, y));
            displayTree(root.right, x + hGap, y + vGap, hGap / 2, color);
        }

       
        
        Circle circle = new Circle(x, y, radius);
        circle.setFill(color);
        circle.setStroke(Color.BLUEVIOLET);
        getChildren().addAll(circle, new Text(x -4, y + 4, root.data + ""));
    }
    

}
