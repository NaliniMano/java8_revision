package java8Functional_Interface;

public class MyPhone {
    public static void main(String[] args) {
        Andriod phone = new Andriod();
        String getodversion =Mobile.getOSVersion();
        System.out.println(getodversion);
        phone.closeApp();
        phone.test();
    }
}
