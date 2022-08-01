package collections_impl.hash;

import java.util.Arrays;

public class HashSet {
    int[] array = new int[1137];

    public HashSet(){
        Arrays.fill(array,-1);
    }

    public void add(int val){
        int location = hash(val);
        array[location] = val;
    }

    public void remove(int val){
        int location = hash(val);
        array[location] = -1;
    }

    public boolean contains(int val){
        int location = hash(val);
        return array[location]!=-1;
    }

    public int hash(int val){
        return (val * 23 ) % 1137;
    }
}
