import java.util.*;

public class Tickets {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<> ();
        map.put("Chennai", "Bangaluru");
        map.put("Mumbai", "Delhi");
        map.put("Patna", "Chennai");
        map.put("Delhi", "Patna");
        String start = findStart(map);
        makePath(start, map);
    }
    public static String findStart(Map<String, String> map) {
        Map<String, String> revMap = new HashMap<> ();
        for(String key : map.keySet()) {
            revMap.put(map.get(key), key);
        }
        for(String key : map.keySet()) {
            if(!revMap.containsKey(key)) return key;
        }
        return null;
    }
    public static void makePath(String start, Map<String, String> map) {
        while(map.containsKey(start)) {
            System.out.print(start + " -> ");
            start = map.get(start);
        }
        System.out.print(start);
    }
}