package java8Functional_Interface.methodreference;

import java.io.File;
import java.io.FileFilter;

public class FindHiddenFile_usingMethodRef {

    public static  void findHiddenFile_beforeJava8(){
        File[] hiddenFiles = new File("C:\\Users\\Admin\\Documents").listFiles(
                new FileFilter() {
                    @Override
                    public boolean accept(File filename) {
                        return filename.isHidden();
                    }
                }
        );
        for(File file : hiddenFiles)
        {
            System.out.println("Hidden file name="+file.getName());
        }

    }

    public static void usingMethodReferene(){
        File[] hiddenFiles = new File("C:\\Users\\Admin\\Documents").
                listFiles(File::isHidden);
        for(File file : hiddenFiles)
        {
            System.out.println("Hidden file name using method reference="+file.getName());
        }

    }

    public static void main(String[] args) {
        usingMethodReferene();
        findHiddenFile_beforeJava8();
    }
}
