package java8Functional_Interface.methodreference;



public class MethodReference_Instance_Demo {

    @FunctionalInterface
    public interface IApp{
         void welcome_message(String input);
    }

    public void greet(String name){
        System.out.println("Hello"+name);
    }

    public static void main(String[] args) {
        MethodReference_Instance_Demo methodref_instance = new MethodReference_Instance_Demo();
        IApp iapp = methodref_instance::greet;
        iapp.welcome_message(" World ...");
    }
}
