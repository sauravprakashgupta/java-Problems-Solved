import java.util.*;

public class MainClass {
    public static void main(String args[]){
        String[] things = {"XXX","AAA","BBB","CCC","BBB","DDD","EEE","FFF","AAA"};
        List<String> list = Arrays.asList(things);
        System.out.println(list);

        Set<String> set = new HashSet<String>(list);
        System.out.println(set);
    }
}
