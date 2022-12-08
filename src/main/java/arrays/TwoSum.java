package src.main.java.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main (String args[]){

        Integer[] intArray= {2,3,4};
        int target = 7;

        int[] twoSumindices = findTwoSum(intArray, target);
        System.out.println("Indixes which equals target value "+ Arrays.toString(twoSumindices));


    }


    /*

    Stores the previous difference with target as a key in the hashmap and then for every element checks if the needed difference is already in hashmap returns the index.


     Initialize an empty HashMap.
     Iterate over the elements of the array.
     For every element in the array -
     If the element exists in the Map, then check if it’s complement (target - element) also exists in the Map or not. If the complement exists then return the indices of the current element and the complement.
     Otherwise, put the element in the Map, and move to the next iteration.


     */



    private static  int[] findTwoSum(Integer[] values, int target)
    {

        Map<Integer, Integer> indicesMap = new HashMap<>();

        for(int i=0 ; i<= values.length-1; i++) {

            int key = target-values[i];

            if(indicesMap.containsKey(key)){
                return new int[] {indicesMap.get(key), i};
            }
            else {

                indicesMap.put(values[i],i);
            }

        }

        return new int[] {};
    }
}
