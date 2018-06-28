//Java Exercises: Write and read a plain text file

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Directory {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
        {
            String filename= "C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDoc.txt";
            FileWriter fw = new FileWriter(filename,false);
            //appends the string to the file
            fw.write("Python Exercises\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDoc.txt"));
            //read the file content
            while (strLine != null)
            {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}