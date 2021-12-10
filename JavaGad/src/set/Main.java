package set;

import java.util.*;


public class Main {

    public static void createSet() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,2,4,6,7));
        Collection<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
    }

    public static void createMap() {
        Map newMap = new HashMap();
        newMap.put(1,"One");
        newMap.put(5,"Five");
        newMap.put(7,"Seven");
        System.out.println(newMap);
    }

    public static void main(String[] args) {
       createSet();
       createMap();


    }
}
