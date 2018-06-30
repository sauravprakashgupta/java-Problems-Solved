import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDoc.txt");
        if (x.exists()){
            System.out.println(x.getName() + " exist");
        }
        else{
            System.out.println(x.getName() + " does not exist");
        }

    }
}
