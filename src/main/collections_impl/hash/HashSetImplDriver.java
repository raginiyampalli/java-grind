package collections_impl.hash;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplDriver {

    int [] array = new int[100];

 public static void main(String args[]){

     Set set = new HashSet();
     set.add(3);
     set.add(78);

     System.out.println(set.contains(3));

     System.out.println(set.contains(32));

     set.remove(3);

     System.out.println(set.contains(3));


 }

}
