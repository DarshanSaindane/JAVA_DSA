import java.util.HashMap;
public class itterateMap{
    public static void main(String[] args){
         HashMap<String,Integer> map = new HashMap<>();
        map.put("Darshan",48);
        map.put("Rohan",45);
        map.put("Shubham",25);
        map.put("Sushant",42);
        map.put("Nishant",21);
        map.put("Rahul",50);

        //itteration 
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();

        for(int val : map.values()){
            System.out.println(val);
        }


    }
}