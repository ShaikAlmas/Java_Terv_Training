import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        
        // Display the HashMap
        System.out.println("HashMap: " + hm);
        
        // Check if a key exists
        System.out.println("Contains key 2? " + hm.containsKey(2));
        
        // Get value for a specific key
        System.out.println("Value for key 3: " + hm.get(3));
        
        // Remove a key-value pair
        hm.remove(4);
        System.out.println("After removing key 4: " + hm);
        
        // Iterate through the HashMap
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
