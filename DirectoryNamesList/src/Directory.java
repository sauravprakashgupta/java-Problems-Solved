import java.io.File;
import java.util.Date;

public class Directory {
    public static void main(String a[])
    {
        File file = new File("E:\\software\\javaFiles\\");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}