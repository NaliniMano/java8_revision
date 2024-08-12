package interview;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array={1,2,4,5}; // 3 is missing number
        int totalsum=0;
        int sum=0;
        int n=array.length+1;
        totalsum=(n * (n+1))/2;

        for(int num:array)
        {
            sum+=num;
        }
        System.out.println(totalsum-sum);

    }
}
