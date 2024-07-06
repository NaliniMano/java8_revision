package java8Functional_Interface;

public class ChromeBrowser implements Browser
    {
        Browser browser=()->{
            return "103.05"; //return version
             };

        public static void main(String[] args) {
            ChromeBrowser chromeBrowser= new ChromeBrowser();
            System.out.println(chromeBrowser.getVersion());
        }

        @Override
        public String getVersion() {
            return "103.05";
        }
    }


    
