
package src.main.java.arrays;


public class LargestValueArray {

    public static void main (String args[]){
         Integer[] intArray= {1,7,21,44,52,86};
        int largestVal = 0;
        int index =0;

        for(int i=0; i < intArray.length; i++){


            if(intArray[i] > largestVal){
                largestVal=intArray[i];
                index = i;
            }



        }

        System.out.println("Largest Value is "+largestVal+" and at index "+index);

    }


}