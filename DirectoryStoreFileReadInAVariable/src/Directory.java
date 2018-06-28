//Java Exercises: Read a file line by line and store it into a variable

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class Directory {

    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
            System.out.println("Connecting ...");
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDoc.txt"));
            System.out.println("Connected");
            System.out.println("Reading ...");
            while (strLine != null)
            {
                if (strLine == null)
                    break;
                str_data += strLine;
                strLine = br.readLine();
            }
            System.out.println("Wait... writing");
            System.out.println(str_data);
            System.out.println("DONE");
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
