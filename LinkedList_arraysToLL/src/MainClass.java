import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class MainClass {
    public static void main(String args[]){
        String[] things = new String[4];
        //things = {"AAA","BBB","CCC","DDD","EEE","FFF","GGG","HHH","III"};
        things[0] = "AAA";
        things[1] = "BBB";
        things[2] = "CCC";
        things[3] = "DDD";

        LinkedList<String> list = new LinkedList<String>(Arrays.asList(things));

        list.add("one");
        list.addFirst("first");

        things = list.toArray(new String[list.size()]);

        System.out.println(things[3]);
        System.out.println(things[0]);
    }
}
