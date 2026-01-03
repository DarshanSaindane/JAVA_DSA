import java.util.*;
public class basicOfHashMap{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Darshan",48);
        map.put("Rohan",45);
        map.put("Shubham",25);
        map.put("Sushant",42);
        map.put("Nishant",21);
        map.put("Rahul",50);
        System.out.println(map);
        map.put("Darshan", 23);
         System.out.println(map);
        map.put("Rohit",45 );
         System.out.println(map);
        
        //In Hashmap there can be 2 or more keys with same vals
        //but Keys are unique

        System.out.println(map.containsValue(45));
        //it show's that this value is present in map or not it give boolean o/p

        System.out.println(map.size());
        //this gives the size of the map

        map.remove("Rohan");
        //it remove the pair from the map
    }
}