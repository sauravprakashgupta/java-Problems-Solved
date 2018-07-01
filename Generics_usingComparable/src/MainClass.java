import java.util.*;

public class MainClass {
    public static void main(String args[]){

        System.out.println(max(12,14,2));
        System.out.println(max("hello","world","Java"));

    }

    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T max = a;
        if(b.compareTo(a) > 0){
            max = b;
        }
        if(c.compareTo(a) > 0){
            max = c;
        }
        return max;
    }
}