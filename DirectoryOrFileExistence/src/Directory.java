//Java Exercises: Check if a file or directory specified by pathname exists or not

import java.io.File;
public class Directory {
    public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("C:\\Users\\SouravG\\Downloads\\saurav");
        if (my_file_dir.exists())
        {
            System.out.println("The directory or file exists.\n");
        }
        else
        {
            System.out.println("The directory or file does not exist.\n");
        }
    }
}