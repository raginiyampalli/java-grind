import java.util.HashSet;
import java.util.Set;

/**
 * add(value)
 * remove(value)
 * size()
 * clear()
 * isEmpty()
 * contains(value)
 */
public class HashSetMethods {
    public static void main(String args[]){
        Set<String> set = new HashSet<>();
        set.add("ABC");
        set.add("XYZ");

        System.out.println(set.contains("ABC"));
        System.out.println(set.isEmpty());

        set.remove("ABC");

        System.out.println(set.size());

        set.clear();

        System.out.println(set.isEmpty());

    }
}
