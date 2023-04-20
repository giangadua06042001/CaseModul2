package logic;

import mota.NhanVien;

import java.util.Comparator;
import java.util.Date;

public class Sort implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return Double.compare(o1.Payroll(),o2.Payroll());
    }
}
