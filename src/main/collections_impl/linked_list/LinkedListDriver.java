package collections_impl.linked_list;

public class LinkedListDriver {

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.add(8);
        list.add(10);
        list.add(190);
        list.add(100);
        System.out.println("Size : " + list.size());

        System.out.println("Removed ?" +list.remove(190));

        int[] values = list.getAllValues();
        System.out.println("******  current values  *******");
        for(int val: values){
            System.out.println(val);
        }
        System.out.println("************************");



    }
}
