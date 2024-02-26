import java.util.*;

class Hashing {
    public static void main(String[] args) {
        //call the structure you want to use
        hashmap(); 
    }

    static void hashmap() {
        //Unordered
        HashMap<Integer, Integer> map = new HashMap<>();

        //Insert
        map.put(1, 050);
        map.put(2, 051);

        // map.containsKey(1); returns boolean
        //map.get(1); gets the corresponding value
        //Iteration 

        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(map);
    } 

    /* 
    static void hashset() {
        //ONLY UNIQUE ELEMENTS AND UNORDERED
        //insert O(1), Search O(1), Delete O(1)

        HashSet<Integer> set = new HashSet<>();
        
        //Insert
        set.add(2);
        set.add(4);

        //Search
        boolean check = set.contains(4);
        //Delete
        set.remove(4);

        //Iterating using the iterator class
        Iterator<Integer> it = set.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    } */
    
}