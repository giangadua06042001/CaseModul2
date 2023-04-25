package readWritefile;

import mota.NhanVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadWfile {
    public List<NhanVien> readFile() {
        List<NhanVien> nhanViens = new ArrayList<>();

        try {
            File file = new File("D:\\demoCase\\NhanVien.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            if (!(fileInputStream.available() == 0)) {
                ObjectInputStream oss = new ObjectInputStream(fileInputStream);
                nhanViens = (List<NhanVien>) oss.readObject();
            } else {
                return nhanViens;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nhanViens;

    }
}
