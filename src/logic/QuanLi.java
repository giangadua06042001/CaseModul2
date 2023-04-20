package logic;

import mota.CongNhan;
import mota.NhanVien;
import mota.NhanVienIT;
import mota.NhanVienVp;
import readWritefile.WriteToFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuanLi extends Logic {
    private List<NhanVien> nhanViens;

    public QuanLi() {
        this.nhanViens = new ArrayList<>();
    }

    public QuanLi(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    @Override
    public void add(NhanVien nhanVien) {
        nhanViens.add(nhanVien);

        WriteToFile.writeToFile(nhanViens);
    }

    public void showlistNVIT(){
        for (NhanVien nv:nhanViens) {
            NhanVienIT nhanVienIT=nv instanceof NhanVienIT?((NhanVienIT)nv):null;
            for (int i = 0; i < nhanViens.size(); i++) {
                System.out.println(nhanVienIT);
            }
        }
    }
    public void showlistNVVP(){
        for (NhanVien nv:nhanViens) {
            NhanVienVp nhanVienVp=nv instanceof NhanVienVp?((NhanVienVp) nv):null;
            for (int i = 0; i < nhanViens.size(); i++) {
                System.out.println(nhanVienVp);

            }
        }
    }
    public void showlistCN(){
        for (NhanVien nv:nhanViens ) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            for (int i = 0; i < nhanViens.size(); i++) {
                System.out.println(congNhan);
            }
        }
    }

    @Override
    public void search(String id) {
        for (NhanVien nv : nhanViens) {
            if (nv.id().equals(id)) {
                System.out.println(nv);
                break;
            }
        }
    }

    public void Search(String name) {
        for (NhanVien nv : nhanViens) {
            if (nv.name().equals(name)) {
                System.out.println(nv);
                break;
            } else {
                System.out.println("khong tim thay");
            }
        }
    }

    @Override
    public void edit(String id, NhanVien nhanVien) {
        for (int i = 0; i < nhanViens.size(); i++) {
            if (nhanViens.get(i).id().equals(id)) {
                nhanViens.set(i, nhanVien);
                WriteToFile.readFile();
            }

        }
    }


    @Override
    public void delete(String id) {
        for (NhanVien nv:nhanViens) {
            NhanVienIT nhanVienIT=nv instanceof NhanVienIT?((NhanVienIT)nv):null;
            assert nhanVienIT != null;
            if(nhanVienIT.id().equals(id)){
                nhanViens.remove(nhanVienIT);
            }

        }
    }
    public void deleteNVVP(String id){
        for (NhanVien nv:nhanViens) {
            NhanVienVp nhanVienVp=nv instanceof NhanVienVp?((NhanVienVp)nv):null;
            assert nhanVienVp!=null;
            if(nhanVienVp.id().equals(id)){
                nhanViens.remove(nhanVienVp);
            }
        }
    }
    public void deleteCN(String id){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert  congNhan!=null;
            if(congNhan.id().equals(id)){
                nhanViens.remove(congNhan);
            }
        }
    }

    public double total() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            total += nv.Payroll();
            WriteToFile.readFile();

        }
        return total;
    }

    public double salaryNVIT() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            total = nhanVienIT.Payroll();


        }
        return total;
    }

    public double salaryNVVP() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            total = nhanVienVp.Payroll();
            WriteToFile.readFile();
        }
        return total;

    }

    public double salaryCN() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            total = congNhan.Payroll();
            WriteToFile.readFile();
        }
        return total;
    }

    public double LTB() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            total = total() / nhanViens.size();
        }
        return total;
    }

    public List<NhanVien> danhsach() {
        for (NhanVien nv : nhanViens) {
            if (nv.Payroll() < LTB()) {
                System.out.println(nv);
            }

        }
        return null;
    }

    public List<NhanVien> SapXep() {
        Collections.sort(nhanViens, new Sort());
        return nhanViens;

    }

    public void editNV(String id) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setId(id);
        }
    }

    public void editName(String name) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setName(name);
        }
    }

    public void editAge(int age) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setAge(age);
        }
    }

    public void editLuong(double wage) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setWage(wage);
        }
    }

    public void editNumber(int number) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setNumber(number);
        }
    }

    public void editEmail(String mail) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setEmail(mail);
        }
    }

    public void editThuong(double thuong) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setBonus(thuong);
        }
    }

    public void editPhat(double phat) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setPunish(phat);
        }
    }

    public void editChuyenCan(double cc) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setAttendanceMoney(cc);
        }
    }

    public void editLang(String lang) {
        for (NhanVien nv : nhanViens) {
            NhanVienIT nhanVienIT = nv instanceof NhanVienIT ? ((NhanVienIT) nv) : null;
            assert nhanVienIT != null;
            nhanVienIT.setLanguage(lang);
        }
    }

    public void editNVP(String id) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setId(id);
        }
    }

    public void editNameNVP(String name) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setName(name);
        }

    }

    public void editAgeNVP(int age) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setAge(age);
        }
    }

    public void editLuongNVP(double luong) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setWage(luong);
        }
    }

    public void editNumberNVP(int number) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setNumber(number);
        }
    }

    public void editMailNVP(String email) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setEmail(email);
        }

    }
    public void editThuongNVP(double thuong){
        for (NhanVien nv:nhanViens) {
            NhanVienVp nhanVienVp=nv instanceof NhanVienVp?((NhanVienVp)nv):null;
            assert nhanVienVp!=null;
            nhanVienVp.setBonus(thuong);
        }
    }
    public void editPhatNVP(double phat){
        for (NhanVien nv:nhanViens) {
            NhanVienVp nhanVienVp=nv instanceof NhanVienVp?((NhanVienVp)nv):null;
            assert nhanVienVp!=null;
            nhanVienVp.setPunish(phat);
        }
    }
    public void editChuyenNVP(String CN){
        for (NhanVien nv:nhanViens) {
            NhanVienVp nhanVienVp=nv instanceof NhanVienVp?((NhanVienVp)nv):null;
            assert nhanVienVp!=null;
            nhanVienVp.setSpecialized(CN);
        }
    }
    public void editChucVuNVP(String cv){
        for (NhanVien nv:nhanViens) {
            NhanVienVp nhanVienVp=nv instanceof NhanVienVp?((NhanVienVp)nv):null;
            assert nhanVienVp!=null;
            nhanVienVp.setSpecialized(cv);
        }
    }
    public void editIdCN(String id){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setId(id);
        }
    }
    public void editNameCN(String name){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setName(name);
        }
    }
    public void editAgeCN(int age){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setAge(age);
        }
    }
    public void editLuongCN(double luong){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setWage(luong);
        }
    }
    public void editNumberCN(int number){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setNumber(number);
        }
    }
    public void editEmaiCN(String email){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setEmail(email);
        }
    }
    public void editThuongCN(double thuong){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setBonus(thuong);
        }
    }
    public void editPhatCN(double phat){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setPunish(phat);
        }
    }
    public void thoigianlamthemCN(double overtime){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setOvertime(overtime);
        }
    }
    public void tienlamthemCN(double overtimeMoney){
        for (NhanVien nv:nhanViens) {
            CongNhan congNhan=nv instanceof CongNhan?((CongNhan) nv):null;
            assert congNhan!=null;
            congNhan.setOvertimeMoney(overtimeMoney);
        }
    }
}



