//Java Exercises: Read first 3 lines from a file

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Directory {

    public static void main(String a[]){
        BufferedReader br = null;
        String strLine = "";
        Scanner input = new Scanner(System.in);
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDoc.txt"), "UTF-8"));
            System.out.println("How many lines from beginning you want to read : ");
            int x = input.nextInt();
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= x){
                System.out.println(strLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
        catch (InputMismatchException e) {
            System.err.println("Please enter a number");
        }
        catch (Exception ex){
            System.out.println("OOPS ... what's this error : "+ ex);
        }

    }
}