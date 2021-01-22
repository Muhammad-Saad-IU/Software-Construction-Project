

public class TreeNode<E extends Comparable<E>> {
    public E data;
    public TreeNode<E> left;
    public TreeNode<E> right;
    public int height = 0;
 

    public TreeNode(E e){
        data = e;
    }

    

}
