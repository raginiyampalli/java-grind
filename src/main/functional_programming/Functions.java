package functional_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Functions {

    public static void main(String args[]){

        List<String> list = List.of("Ragini","Karthik","Ved");
        List<String> filtered = list.stream().filter(a->a.contains("d")).collect(Collectors.toList());

        filtered.stream().forEach(a->System.out.println(a));

        Map<Integer,String> map = Map.of(1,"Ragini",2,"Karthik",3,"Ved");
        Map<Integer,String> filteredMap = map.entrySet().stream().filter(e->e.getKey()==2).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        filteredMap.forEach((k,v)->System.out.println(v));

    }
}
