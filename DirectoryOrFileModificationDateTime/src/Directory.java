//Java Exercises: Check when was the file last modified

import java.io.File;
import java.util.Date;

public class Directory {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDoc.txt");
        Date date = new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: " + date + "\n");
    }
}