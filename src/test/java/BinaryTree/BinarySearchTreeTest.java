package BinaryTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BinarySearchTreeTest {
    BinarySearchTree<Integer> tree;
    Node<Integer> root;

    @BeforeEach
    public void execute() {
        tree = new BinarySearchTree<>();


    }

    @Test
    public void insert() {
        tree.insert(root, 56);
        tree.insert(root, 30);
        tree.insert(root, 70);
    }