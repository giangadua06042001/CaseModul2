package readWritefile;

import mota.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {
    public  static  void writeToFile(List<NhanVien>nhanViens){
        File file=new File("NhanVien.txt");
        try{
            FileOutputStream outputStream=new FileOutputStream(file);
            ObjectOutputStream oss=new ObjectOutputStream(outputStream);
            oss.writeObject(nhanViens);
            oss.close();
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
