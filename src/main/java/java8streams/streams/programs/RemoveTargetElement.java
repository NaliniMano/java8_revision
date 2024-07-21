package java8streams.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveTargetElement {
    /****
     * Given Input array remove the target element present in the array
     *
     */
    public static void removeTarget(int[] arr,int removelement){

            List<Integer> list = Arrays.stream(arr).boxed()
                    .filter(n -> n != removelement).collect(Collectors.toList());
            System.out.println("Output="+list);


    }
    public static void main(String[] args) {
        int input[]={2,5,6,3,2,3,2}; // postive
        int target=2;
        removeTarget(input,target);

        int input1[]={}; // negative
        int target1=2;
        removeTarget(input1,target1);

        int[] input2={2,2,2,2,2,2}; // edge
        int target2=2;
        removeTarget(input2,target2);
    }
}
