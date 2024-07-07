package java8Functional_Interface;

@FunctionalInterface
public interface Mobile {
    static  String getOSVersion(){
        return "105.2";
    }
    default void closeApp(){
        System.out.println("Closed from mobile");
    }
    void test();
}
