package Array;

import java.util.ArrayList;

import Basics.sumOfTwoNumberInput;

public class basicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);   //initialize befor coma is index of arrayList and after comma element in arrayList.
        arr.add(1,20);   // arr[1] = 20
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
      
       // System.out.println(arr); //built in finction for prinnting of arrayList.

        for (int i = 0; i < 6; i++) {
                System.out.print(arr.get(i) + " ");  //general method of printing of arrayList

        }
        System.out.println();

        arr.set(2,300); //MODIFY
        for (int i = 0; i < 6; i++) {
            System.out.print(arr.get(i)+" ");
        }

        arr.add(69);         // Push Back means add the element in arratList at the end.
        System.out.println();
        System.out.println(arr.size()); //display size of arrayList
        System.out.println(arr);


    }
}
    



