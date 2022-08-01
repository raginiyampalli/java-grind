package collections_impl.doubly_linked_list;

public class DoublyLinkedList {
    Node head;
    int size;

    public void add(int value){

        if(head==null){
            head = new Node(value,null,null);
        } else {
            Node current = head;
            while(current.right!=null){
                current = current.right;
            }
            Node newNode = new Node(value,current,null);
            current.right = newNode; //updating last node's right pointer to the newest node added.
        }
        size++;
    }

    public int size(){
        return size;
    }

    public int[] getValues(){
        int[] values = new int[size];
        Node node = head;
        int count = 0;
        while(node!=null ){
            values[count] = node.value;
            node = node.right;
            count++;
        }
        return values;
    }

    public boolean remove(int value){

        Node node = head;
        Node previous = head;
        while(node!=null){
            if(node.value == value){
                // this is the node that needs to be deleted.
                if(node.right == null){
                    // this is the last node.
                    previous.right = null;
                } else {
                    Node next = node.right;
                    next.left = previous;
                    previous.right = next;

                }
                size --;
            }
            previous = node;
            node = node.right;
        }

        return false ; //value not found
    }
}
