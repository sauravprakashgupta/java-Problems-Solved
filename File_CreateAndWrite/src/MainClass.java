import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        FileClass file = new FileClass();
        file.createFile("C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDocNew.txt");
        file.addRecords(" This is the content of my file, Line 1. \n This is the content of my file, Line 2. \n This is the content of my file, Line 3.");
        file.closeFile();

        file.readRecords("C:\\Users\\SouravG\\Downloads\\saurav\\testFoleder\\testDocNew.txt");

    }
}