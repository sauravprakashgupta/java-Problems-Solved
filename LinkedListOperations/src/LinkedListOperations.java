import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class LinkedListOperations {
    public static void main(String args[]){
        String[] things = {"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN"};
        List<String> list1 = new LinkedList<String>();
        for(String x:things){
            list1.add(x);
        }

        String[] things2 = {"AAA","BBB","CCC","DDD","EEE","FFF","GGG"};
        List<String> list2 = new LinkedList<String>();
        for(String y:things2){
            list2.add(y);
        }

        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1,2,5);
        printMe(list1);
        reverseMe(list1);
    }

    private static void printMe(List<String> l){
        for(String b:l){
            System.out.print(" " + b);
        }
        System.out.println("");
    }

    private static void removeStuff(List<String> l, int from, int to){
        l.subList(from, to).clear();
    }

    private static void reverseMe(List<String> l){
        ListIterator<String> revr = l.listIterator(l.size());
        while(revr.hasPrevious()){
            System.out.print(" "+ revr.previous());
        }
        System.out.println("");
    }
}
