import java.util.*;

class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();// ye waala hashmap hai
        
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("David", 40);

        System.out.println("HashMap Contents:");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
