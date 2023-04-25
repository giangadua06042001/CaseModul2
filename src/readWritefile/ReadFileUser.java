package readWritefile;

import dangKys.Manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUser {
    public List<Manager>readFile(){
        List<Manager>managers=new ArrayList<>();
        try {
            File file=new File("User.txtw");
            FileInputStream inputStream=new FileInputStream(file);
            if(! (inputStream.available()==0)){
                ObjectInputStream oss=new ObjectInputStream(inputStream);
                managers= (List<Manager>) oss.readObject();
            }
            else {
                return managers;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return managers;
    }


}
