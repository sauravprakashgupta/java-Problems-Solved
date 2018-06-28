//Java Exercises: Get specific files by extensions from a specified folder

import java.io.File;
import java.io.FilenameFilter;
public class Directory {
    public static void main(String a[]){
        File file = new File("C:\\Users\\SouravG\\Downloads");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".pdf")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}