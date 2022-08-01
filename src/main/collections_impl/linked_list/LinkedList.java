package collections_impl.linked_list;

public class LinkedList {

    Node first ;
    int count=0;

    public boolean add(int val){

        Node newNode = new Node(val,null);
        if(first == null ){
            first = newNode;
            count =1;
            return true;
        }

        Node current = first;

        while(current.next!=null){
            current = current.next;
        }

        current.next = newNode;
        count ++;
        return true;

    }

    public int size(){
        return this.count;
    }

    public boolean remove(int val){
        Node current = first;
        Node previous = first;

        while(current!=null){
            if(current.value == val){
                //this is the node that needs to be deleted.
                if(current.next == null){
                    previous.next = null;
                } else {
                    previous.next = current.next;
                }
                count--;
                return true;
                // delete and return true;
            }
            previous = current;
            current = current.next;
        }

        //went through the whole list and did not find the value.
        return false;
    }

    public int[] getAllValues(){
        int[] result = new int[count];
        Node current = first;
        int ptr = 0;
        while(current!=null){
            result[ptr] = current.value;
            current = current.next;
            ptr++;
        }

        return result;
    }
}
