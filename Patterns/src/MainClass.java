/*Rectangle made with stars*/

import java.io.*;
import java.util.Scanner;
public class MainClass {

    public static void main(String a[]) throws Exception {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int width = input.nextInt();

        printLendth(length);
        System.out.println();
        printWidth(width-2, length -2);
        printLendth(length);
    }
    public static void printLendth(int length){
        for(int i=0;i<length;i++){
            System.out.print("*");
        }

    }
    public static void printWidth(int width, int length){

        for(int j=0;j<width;j++){
            System.out.print("*");
            for(int i=0;i<length;i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}