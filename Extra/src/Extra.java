//Java Exercises: Get list of all file/directory names

import java.io.File;
import java.util.Date;

public class Extra {
    public static void main(String a[])
    {
        File file = new File("E:\\software\\javaFiles\\");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
} 