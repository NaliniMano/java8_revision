package interview;

public class FindSmallest_LargestNum {
    public static void main(String[] args) {
        int[] arr={12,14,11,10,-1,2};
        int small=arr[0];
        int large=arr[0];
        for(int num : arr)
        {
            if(num < small)
                small=num;
            if(num > large)
                large=num;
        }
        System.out.println("Small" + small +"Largest"+large);
    }
}
