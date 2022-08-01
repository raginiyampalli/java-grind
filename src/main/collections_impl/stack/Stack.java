package collections_impl.stack;

public class Stack {

    Node head; // should always be the most recently added node.
    int size;

    public void push(int value){
        if(head == null){
            Node newNode = new Node(value,null);
            head = newNode;
        } else {
            Node newNode = new Node(value,head);
            head = newNode;
        }
        size++;
    }

    public int pop(){
        if(head!=null){
            int result = head.value;
            head = head.next!=null ? head.next : null ;
            size--;
            return result;
        }
        return -1;
    }

    public int top(){
        if(head!=null){
            return head.value;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    public boolean empty(){
        return head==null;
    }


}
