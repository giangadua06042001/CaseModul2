package readWritefile;

import dangKys.Manager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteUser {
    public static void writeFile(List<Manager>managers){
        File file=new File("User.txt");
        try{
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            ObjectOutputStream oss=new ObjectOutputStream(fileOutputStream);
            oss.writeObject(managers);
            oss.close();
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
