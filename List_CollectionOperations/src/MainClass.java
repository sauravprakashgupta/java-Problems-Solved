import java.util.*;

public class MainClass {
    public static void main(String args[]){

        //collection method specifically for list
        Character[] ray = {'p','w','n',1,5,'r'};
        List<Character> l = Arrays.asList(ray);

        System.out.print("List is : " );
        output(l);

        //reverse and print out the list

        Collections.reverse(l);
        System.out.print("After reverse : ");
        output(l);

        Character[] newRay = new Character[ray.length];
        List<Character> listCopy = Arrays.asList(newRay);

        Collections.copy(listCopy, l);
        System.out.print("Copy of list : ");
        output(listCopy);

        Collections.fill(l,'A');
        System.out.print("After filling the list : " );
        output(l);

    }

    private static void output(List<Character> thelist){
        for(Character thing:thelist){
            System.out.print(thing);
        }
        System.out.println("");
    }
}
