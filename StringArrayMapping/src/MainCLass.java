import java.io.*;
import java.util.Scanner;
public class MainCLass {

    public static String names[] = {"Donald", "Mickey", "Popeye", "Simba", "Nemo"};
    public static String surnames[] = {"Duck", "Mouse", "The sailor", "The Lion King", "The fish"};

    public static void main(String a[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        int found = -1;


        System.out.println("Enter the name:");
        name = sc.next();
        System.out.println("Full name of the Cartoon is:");
 /*write down your logic*/

        int l = names.length;

        for(int i=0;i< l;i++){
            if(name.equalsIgnoreCase(names[i])){
                found = i ;
                break;
            }
        }
        System.out.println(names[found] + " " + surnames[found]);
    }//main
}
