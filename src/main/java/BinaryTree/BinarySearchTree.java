package BinaryTree;


import org.w3c.dom.Node;
public class BinarySearchTree <T extends Comparable<T>> {

    public void insert(Node<T> root, T data){
        if(root == null){
            root = new Node<>(data);
        }
        else if(root.data.compareTo(data) < 0){
            if(root.right == null){
                root.right =  new Node<>(data);
                return;
            }

            insert(root.right,data);
        }else {
            if(root.left == null) {
                root.left = new Node<>(data);
                return;
            }
            insert(root.left,data);

        }

    }
    public void inOrder(Node<T> root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}