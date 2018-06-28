import java.util.Scanner;
public class DayChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean check = false;
        int i = 0;
        do{
            System.out.println("Enter");
            try {
                i = input.nextInt();
            }
            catch (Exception e){
                System.out.println(e);
            }


            check = false;
            if(i>7 || i<0){
                System.out.println("if you are confused type quit else anything else");
                String a = input.nextLine();
                if(a.equalsIgnoreCase("quit")){
                    check = true;
                }
                else{
                    check = false;
                }
            }
            else {
                switch (i) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    case 0:
                        System.out.println("If you want to quit --- type quit");
                }
            }
        }while(check==false);
    }
}