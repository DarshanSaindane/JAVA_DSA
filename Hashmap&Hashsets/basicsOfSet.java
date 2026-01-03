import java.util.HashSet;
public class basicsOfSet{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        //Insert in HashSet. TC O(1)
        set.add(10);
        set.add(39);
        set.add(23);
        set.add(27);
        set.add(238);
        set.add(20);
        //printing of hashset
        System.out.println(set);

        //search : true or false. Time complaxty id O(1)
        System.out.println(set.contains(5));

        //size of set
        System.out.println(set.size());

        //remove TC O(1)
        set.remove(23);
        System.out.println(set);

        //ToArray

        Object[] arr = set.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Itterate in set
        for( int ele : set){  //At the time of itteration we cannot add or remove the element 
            System.out.print(ele+" ");
        }
        System.out.println();

        //In HashSet occurance of every element if one
        //we cannot add one element twice

        //Hashset can be characturs,string,Integer,Double,long..


    }
}