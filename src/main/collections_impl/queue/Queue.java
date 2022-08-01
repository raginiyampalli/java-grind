package collections_impl.queue;

public class Queue {

    Node first; //pointer to the first element
    Node last; // pointer to the last element
    int size ;

    // Add elements to last.next and update last to last.next
    // Remove elements from first and update first to first.next

    public void add(int val){
        Node temp = new Node(val,null);

        if(first == null){
            first = temp;
        }else if(last == null){
            last = temp;
            first.next = last;
        } else {
            last.next = temp;
            last = last.next;
        }
            size++;
     }

     public int peek(){
        if(first!=null){
            return first.value;
        }
        return -1;
     }

     public int size(){
        return size;
     }

     public int poll(){

        if(first!=null){
            int result = first.value;
            first = first.next;
            size--;
            return result;
        }

        return -1;
     }


}
