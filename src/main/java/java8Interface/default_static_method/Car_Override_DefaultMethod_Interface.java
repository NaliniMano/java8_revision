package java8Interface.default_static_method;

public class Car_Override_DefaultMethod_Interface implements  Vehicle {


    @Override
    public void soundHorn() {
        System.out.println("Horn from Car Override");

    }
//applyBrake is  default method from Vehicle interface
    @Override
    public void applyBrake() {
        System.out.println("ABS Brake from Car Override");
    }
}
