import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class FileClass {
    private String filePath;
    private String fileContent;
    private Formatter x;

    public void createFile(String _filePath) {
        filePath = _filePath;
        final Formatter x;
        try {
            x = new Formatter(filePath);
            System.out.println("File Cretaed at : " + filePath);
        } catch (FileNotFoundException ex) {
            System.out.println("You got an Error");
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addRecords(String _fileContent) {
        fileContent = _fileContent;
        try {
            x = new Formatter(filePath);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        x.format(fileContent);
    }

    public void closeFile() {
        x.close();
    }

    public void readRecords(String _filePath){
        filePath = _filePath;
        String line = null;
        try{
            FileReader fileReader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fileReader);

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
        catch (FileNotFoundException FNFex){
            System.out.println("File Not found Exception encountered");
            FNFex.printStackTrace();
        }
        catch (IOException IOex){
            System.out.println("IO Exception encountered");
            IOex.printStackTrace();
        }
        catch (Exception ex){
            System.out.println("General Exception :" +ex);
        }
    }
}