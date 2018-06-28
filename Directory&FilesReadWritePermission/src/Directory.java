//Java Exercises: Check if a file or directory has read and write permission
//NOTE: for files its very important to provide the extention type. this will help identyfying the file as well which program should be used to open the file


import java.io.File;
public class Directory {
    public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDoc.txt");
        if (my_file_dir.canWrite())
        {
            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
        }
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
        }
        if (my_file_dir.canRead())
        {
            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
        }
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
        }
    }
}