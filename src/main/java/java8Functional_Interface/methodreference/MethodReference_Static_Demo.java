package java8Functional_Interface.methodreference;

public class MethodReference_Static_Demo {

    @FunctionalInterface
    public interface  Iapp{
         void add(int val1,int val2);
    }

    public static void add(int num1,int num2)
    {
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        Iapp iapp = MethodReference_Static_Demo::add;
        iapp.add(2,3);
    }
}
