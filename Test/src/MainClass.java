import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.*;
public class MainClass {
    public static void main(String args[]){
        List<String> list1 = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int x =1;
        do{
            System.out.println("Type : Find-To search, Exit/Quit : to exit, Show: to show list.... else all inputs will be added in the list");
            System.out.println("Enter : ");
            String name = input.nextLine();
            list1.add(name);
            System.out.println("");

            if(name.equalsIgnoreCase("EXIT") || name.equalsIgnoreCase("QUIT")){
                x =2;
            }
            else if(name.equalsIgnoreCase("SHOW")){

                list1.remove(name);
                for(String show:list1){
                    System.out.println(show);
                    continue;
                }
            }
            else if(name.equalsIgnoreCase("FIND")){
                list1.remove(name);
                boolean search = false;
                System.out.println("What do you want to search in the list : ");
                String findObject = input.nextLine();

                for(String l: list1){
                    if(findObject.equalsIgnoreCase(l)){
                        search = true;
                        break;
                    }
                }
                if(search == false){
                    System.out.println("Not Found");
                }
                else{
                    System.out.println("Found");
                }
            }
        }while(x ==1);
        System.out.println("you have Exited... Bye !!!");
    }
}
