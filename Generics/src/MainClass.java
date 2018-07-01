import java.util.*;

public class MainClass {
    public static void main(String args[]){
        Integer[] iray = {1,2,3,4};
        Character[] cray = {'s','a','u','r','a','v'};

        printMe(iray);
        printMe(cray);
    }

    //generic Method
    public static <T> void printMe(T[] x){
        for(T b:x){
            System.out.print(b + " ");
        }
        System.out.println("");
    }

/* public static void printMe(Integer[] i){
 for(Integer x:i){
 System.out.print(x + " " );
 }
 System.out.println("");
 }

 public static void printMe(Character[] c){
 for(Character x:c){
 System.out.print(x + " ");
 }
 System.out.println("");
 }
 */

}
