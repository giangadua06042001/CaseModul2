package input;

import mota.NhanVien;
import readWritefile.ReadWfile;

import java.util.ArrayList;

public class CheckID {
 private    ArrayList<NhanVien>nhanViens;
    ReadWfile readWfile=new ReadWfile();

    public CheckID() {
        nhanViens=new ArrayList<>();
        nhanViens= (ArrayList<NhanVien>) readWfile.readFile();

    }


    public boolean checkID(String ID){
        boolean check=false;
        for (NhanVien nv :nhanViens) {
            if(nv.getId().equals(ID)){
                System.out.println("ID da ton tai");
                check=true;
            }
        }
        return check;
    }

}
