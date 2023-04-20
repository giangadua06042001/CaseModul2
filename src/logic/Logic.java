package logic;

import mota.NhanVien;
import mota.NhanVienVp;

public abstract class Logic {
    public abstract void add(NhanVien nhanVien);
    public abstract void search(String id);
    public abstract void edit(String id,NhanVien nhanVien);
    public abstract void delete(String id);


}
