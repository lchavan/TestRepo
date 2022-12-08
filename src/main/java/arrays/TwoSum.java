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
