//Java Exercises: Check if given pathname is a directory or a file

import java.io.File;
public class Extra {
    public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("C:\\Users\\SouravG\\Downloads\\saurav");
        if (my_file_dir.isDirectory())
        {
            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
        }
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
        }
        if (my_file_dir.isFile())
        {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
        }
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a  file.\n");
        }
    }
}
