package java8Functional_Interface;

public class Laptop{



    public static void main(String[] args) {
        Computer computer=(brand,model)->{
            if(brand.equals("dell") && model.equals("xp"))
                return "Win 11";
            return "Win 7";
        };
     String getversion= computer.getOSVersion("Apple","xp");
     System.out.println(getversion);

    }
}
