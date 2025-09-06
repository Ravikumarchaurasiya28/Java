import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<> ();
        map.put("Bihar", 13);
        map.put("U.P.", 25);
        map.put("M.P.", 12);
        System.out.println(map);
        if(map.containsKey("Bihar")) System.out.println("Present in map");
        else System.out.println("Not present in map");
        if(map.containsKey("Delhi")) System.out.println("Present in map");
        else System.out.println("Not present in map");
        System.out.println(map.get("Bihar"));
        System.out.println(map.get("Delhi"));
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        Set<String> set = map.keySet();
        for(String key : set) {
            System.out.println(key + " " + map.get(key));
        }
        map.remove("U.P.");
        System.out.println(map);
    }
}