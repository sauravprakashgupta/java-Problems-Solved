import java.util.*;

public class MainClass {
    public static void main(String args[]){
        String[] arr = {"AAA","CCC","DDD","FFF","BBB","EEE"};
        List <String> l1 = Arrays.asList(arr);

        Collections.sort(l1);
        System.out.println(l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);

    }
}
