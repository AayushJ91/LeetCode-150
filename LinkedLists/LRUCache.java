import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
//Nhi hua
public class LRUCache {
    private Hashtable<Integer, Integer> map;
    public LRUCache(int capacity) {
        map = new Hashtable<>(capacity);
    }

    public int get(int key) {
        if (map.get(key) == null) {
            return -1;
        }
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache ne = new LRUCache(3);
        ne.put(1,1);
        ne.put(2,2);
        System.out.println(ne.map);
        System.out.println(ne.get(1));
        ne.put(3,3);
        System.out.println(ne.map);
        System.out.println(ne.get(2));
        ne.put(4,4);
        System.out.println(ne.get(1));
        System.out.println(ne.get(3));
        System.out.println(ne.get(4));
    }
}
