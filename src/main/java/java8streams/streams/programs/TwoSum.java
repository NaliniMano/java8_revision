package java8streams.streams.programs;

import java.util.HashMap;

public class TwoSum {

    public  static  void findSum(int[] arr,int checksum)
    {
        HashMap<Integer,Integer>  hmap = new HashMap<>();
        for(int i=0;i< arr.length;i++)
        {
         int diff = checksum-arr[i];
         if(hmap.containsKey(diff))
         {
             System.out.println(hmap.get(diff) + "indices="+i);
         }
         hmap.put(arr[i],i);
        }
        System.out.println(hmap);
    }
    public static void main(String[] args) {
        int[] input={3,4,1,9,5,3,1};
        int target=8;
        findSum(input,target);
    }
}
