import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Scanner;
public class DynamicArrayLengthInput {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        String inputData;
        String quit;
        System.out.println("To quit type quit or exit ");
        boolean isQuit = false;
        do{
            System.out.print("Enter : ");
            isQuit =false;
            inputData = input.nextLine();

            if(inputData.equalsIgnoreCase("quit")||inputData.equalsIgnoreCase("exit")){
                System.out.println(" Are you sure you want to quit ... yes/no: ");
                quit = input.nextLine();
                if (quit.equalsIgnoreCase("yes")||quit.equalsIgnoreCase("y")||quit.equalsIgnoreCase("")){
                    isQuit =true;
                }
                else{
                    arrayList.add(inputData);
                }
            }
            else{
                arrayList.add(inputData);
            }
        }while(isQuit!=true);

        String[] arr = new String[arrayList.size()];

        arrayList.toArray(arr);

        System.out.println(" So this is your final list ");
        for (String p:arr){
            System.out.println(p);
        }
    }
}