package java8Interface.default_static_method;

public class TestRunner {
    public static void main(String[] args) {
        Car mycar=new Car();
        mycar.soundHorn();
        mycar.headLight();
        mycar.applyBrake();
        Vehicle.steering();//Vehicle is an interface

        Car_Override_DefaultMethod_Interface caroveride=new Car_Override_DefaultMethod_Interface();
        caroveride.applyBrake();
        caroveride.soundHorn();
    }

}
