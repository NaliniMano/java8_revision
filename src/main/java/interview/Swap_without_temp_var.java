package interview;

public class Swap_without_temp_var {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swap "+"a ="+a +" b="+b);
        a=a+b;
        b=a-b; //10
        a=a-b;//20

        System.out.println("After Swap "+"a ="+a +" b="+b);

    }
}
