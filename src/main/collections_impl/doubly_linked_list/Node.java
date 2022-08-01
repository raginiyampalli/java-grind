package collections_impl.doubly_linked_list;

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
