package java8Interface.default_static_method;

public interface Vehicle {
    void soundHorn();
    default void applyBrake()
    {
        System.out.println("Brake from Default");
    }
    default void headLight()
    {
       System.out.println("Headlight from Default");
    }
    static void steering()
    {
        System.out.println("Steering static method in Vehicle");
    }
}
