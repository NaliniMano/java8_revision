package java8Functional_Interface;

public class Andriod implements Mobile{


    @Override
    public void closeApp() {
        System.out.println("From Android");
    }

    @Override
    public void test() {
        System.out.println("This is test overide");
    }

}
