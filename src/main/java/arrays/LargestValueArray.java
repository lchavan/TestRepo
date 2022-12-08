package src.main.java.arrays;


import java.util.Arrays;

public class LargestValueArray {

    public static void main (String args[]){

         System.out.println("Args :"+ Arrays.toString(args));
         if(args.length > 0) {
             int largestVal = 0;
             int index = 0;

             for (int i = 0; i < args.length; i++) {
                 if (Integer.parseInt(args[i]) > largestVal) {
                     largestVal = Integer.parseInt(args[i]);
                     index = i;
                 }
             }
             System.out.println("Largest Value is " + largestVal + " and at index " + index);
         }
         else {

             System.out.println("Invalid Parameters");
         }





    }


}