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
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static List<NhanVien> readFile(){
        List<NhanVien>nhanViens=new ArrayList<>();

        try {
            File file=new File("NhanVien.txt");
            FileInputStream fileInputStream=new FileInputStream(file);
            ObjectInputStream oss=new ObjectInputStream(fileInputStream);
            nhanViens=(List<NhanVien>) oss.readObject();
        } catch (Exception e){
            e.printStackTrace();
        }
        return nhanViens;

    }
}
