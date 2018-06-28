import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String colorName = null;
        do{
            colorName = input.nextLine();
            if(!colorName.equalsIgnoreCase("quit")){
                colors.add(colorName);
            }

        }while(!colorName.equalsIgnoreCase("quit") );
        System.out.println(colors);
    }
}