import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * clear()
 * isEmpty()
 * put(key,value)
 * putAll(map)
 * putIfAbsent(key,value)
 * remove(key)
 * get(key)
 * entrySet()
 * keySet()
 * values()
 * containsValue(value)
 * containsKey(key)
 * replace(key,value)
 * size()
 *
 */

public class HashMapMethods {
    public static void main(String args[]){

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Ragini");
        map.replace(1,"Karthik");
        map.putIfAbsent(2,"Ved");
        map.put(3,"Ragini Yampalli");

        System.out.println(map.get(2));
        map.remove(1);
        System.out.println(map.size());

        System.out.println(map.isEmpty());

        Map<Integer,String> map2 = new HashMap();
        map2.put(3,"Ragini");
        map2.put(4,"Hello");
        map2.putAll(map);

        Iterator<String> iterator = map2.values().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
