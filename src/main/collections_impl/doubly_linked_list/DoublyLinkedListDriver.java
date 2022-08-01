package collections_impl.doubly_linked_list;

import collections_impl.doubly_linked_list.DoublyLinkedList;

public class DoublyLinkedListDriver {

    public static void main(String args[]){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(23);
        list.add(42);
        list.add(9);
        list.add(24);

        System.out.println("Size is : " + list.size());
        list.remove(24);
        list.remove(42);
        list.add(32);

        int[] values = list.getValues();
        System.out.println("**** Values are as follows *****");
        for(int val:values){
            System.out.println(val);
        }
    }
}
