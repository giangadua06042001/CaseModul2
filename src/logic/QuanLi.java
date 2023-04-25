package logic;

import input.CheckID;
import mota.CongNhan;
import mota.NhanVien;
import mota.NhanVienIT;
import mota.NhanVienVp;
import readWritefile.ReadWfile;
import readWritefile.WriteToFile;

import java.util.List;
import java.util.Scanner;

public class QuanLi extends Logic {
    private List<NhanVien> nhanViens;
    ReadWfile readWfile = new ReadWfile();


    public QuanLi() {
        nhanViens = readWfile.readFile();
    }

    public QuanLi(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;

    }


    @Override
    public void add(NhanVien nhanVien) {
        boolean check = true;
        for (NhanVien nv : nhanViens) {
            if (nv.getId().equals(nhanVien.getId())) {
                System.out.println("Id da ton tai");
                check = false;
                break;
            }
        }
        if (check) {
            nhanViens.add(nhanVien);
            WriteToFile.writeToFile(nhanViens);
        }
    }


    public void showlistNVIT() {
        for (NhanVien nv : nhanViens) {
            if (nv instanceof NhanVienIT) {
                System.out.println(nv);

            }
        }
    }

    public void showlistNVVP() {
        for (NhanVien nv : nhanViens) {
            if (nv instanceof NhanVienVp) {
                System.out.println(nv);
            }
        }
    }

    public void showlistCN() {
        for (NhanVien nv : nhanViens) {
            if (nv instanceof CongNhan) {
                System.out.println(nv);
            }
        }

    }

    @Override
    public void search(String id) {
        for (NhanVien nv : nhanViens) {
            if (nv.getId().equals(id)) {
                System.out.println(nv);
            }
        }
    }

    public void searchname(String name) {
        boolean check = false;
        for (NhanVien nv : nhanViens) {
            if (nv.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(nv);
                check = true;
            }
        }
        if (!check) {
            System.err.println("khong ton tai");
        }
    }
    public void Searchid(String id){
        boolean check=false;
        for (NhanVien nv:nhanViens) {
            if(nv.getId().toLowerCase().contains(id.toLowerCase())){
                System.out.println(nv);
                check=true;
            }
        }
        if(!check){
            System.err.println("khong ton tai");
        }
    }


    @Override
    public void edit(String id, NhanVien nhanVien) {
        for (int i = 0; i < nhanViens.size(); i++) {
            if (nhanViens.get(i).getId().equals(id)) {
                nhanViens.set(i, nhanVien);

            }

        }
    }


    @Override
    public void delete(String id) {
        int index = getIndexById(id);
        if (index >= 0) {
            nhanViens.remove(index);
        }

    }

    public void showNhanvien() {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv);
        }
    }


    private int getIndexById(String id) {
        int index = -1;
        for (NhanVien nv : nhanViens) {
            if (nv.getId().equals(id)) {
                return nhanViens.indexOf(nv);
            }
        }
        return index;
    }

    public double total() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            total += nv.Payroll();
        }
        return total;
    }

    public double salaryNVIT() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            if (nv instanceof NhanVienIT)
                total += nv.Payroll();


        }
        return total;
    }

    public double salaryNVVP() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            if (nv instanceof NhanVienVp)
                total += nv.Payroll();

        }
        return total;

    }

    public double salaryCN() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            if (nv instanceof CongNhan)
                total += nv.Payroll();
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
        nhanViens.sort(new Sort());
        return nhanViens;

    }

     public NhanVien editNV(String id) {
        for (NhanVien nv : nhanViens) {
            boolean check1 = true;
            if (check1) {
                if (nv instanceof NhanVienIT) {
                    if(nv.getId().equals(id)){
                        System.out.println(nv);
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("nhap lai id moi");
                        String iD = scanner.nextLine();
                        CheckID check = new CheckID();
                        boolean checkName = check.checkID(iD);
                        if (checkName) {
                            do {
                                System.out.println("Nhap lai ID");
                                String ID = scanner.nextLine();
                                checkName = check.checkID(ID);
                                if (!checkName) {
                                    iD = ID;
                                }

                            } while (checkName);
                        }

                        nv.setId(iD);
                        System.out.println(nv);
                    }

                }
            }
        }
        return null;
    }
    public NhanVien editIDVP(String id) {
        for (NhanVien nv : nhanViens) {
            boolean check1 = true;
            if (check1) {
                if (nv instanceof NhanVienVp) {
                    if(nv.getId().equals(id)){
                        System.out.println(nv);
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("nhap lai id moi");
                        String iD = scanner.nextLine();
                        CheckID check = new CheckID();
                        boolean checkName = check.checkID(iD);
                        if (checkName) {
                            do {
                                System.out.println("Nhap lai ID");
                                String ID = scanner.nextLine();
                                checkName = check.checkID(ID);
                                if (!checkName) {
                                    iD = ID;
                                }

                            } while (checkName);
                        }

                        nv.setId(iD);
                        System.out.println(nv);
                    }
                }
            }
        }
        return null;
    }
    public NhanVien editIDCN(String id) {
        for (NhanVien nv : nhanViens) {
            boolean check1 = true;
            if (check1) {
                if (nv instanceof CongNhan) {
                    if(nv.getId().equals(id)){
                        System.out.println(nv);
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("nhap lai id moi");
                        String iD = scanner.nextLine();
                        CheckID check = new CheckID();
                        boolean checkName = check.checkID(iD);
                        if (checkName) {
                            do {
                                System.out.println("Nhap lai ID");
                                String ID = scanner.nextLine();
                                checkName = check.checkID(ID);
                                if (!checkName) {
                                    iD = ID;
                                }

                            } while (checkName);
                        }

                        nv.setId(iD);
                        System.out.println(nv);
                    }
                }
            }
        }
        return null;
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
            nhanVienIT.setSalary(wage);
        }
    }

    public void editNumber(String number) {
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
            nhanVienVp.setSalary(luong);
        }
    }

    public void editNumberNVP(String number) {
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

    public void editThuongNVP(double thuong) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setBonus(thuong);
        }
    }

    public void editPhatNVP(double phat) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setPunish(phat);
        }
    }

    public void editChuyenNVP(String CN) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setSpecialized(CN);
        }
    }

    public void editChucVuNVP(String cv) {
        for (NhanVien nv : nhanViens) {
            NhanVienVp nhanVienVp = nv instanceof NhanVienVp ? ((NhanVienVp) nv) : null;
            assert nhanVienVp != null;
            nhanVienVp.setSpecialized(cv);
        }
    }


    public void editNameCN(String name) {
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            congNhan.setName(name);
        }
    }

    public void editAgeCN(int age) {
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            congNhan.setAge(age);
        }
    }

    public void editLuongCN(double luong) {
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            congNhan.setSalary(luong);
        }
    }

    public void editNumberCN(String number) {
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            congNhan.setNumber(number);
        }
    }

    public void editEmaiCN(String email) {
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            congNhan.setEmail(email);
        }
    }

    public void editThuongCN(double thuong) {
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            congNhan.setBonus(thuong);
        }
    }

    public void editPhatCN(double phat) {
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            congNhan.setPunish(phat);
        }
    }

    public void thoigianlamthemCN(double overtime) {
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            congNhan.setOvertime(overtime);
        }
    }

    public void tienlamthemCN(double overtimeMoney) {
        for (NhanVien nv : nhanViens) {
            CongNhan congNhan = nv instanceof CongNhan ? ((CongNhan) nv) : null;
            assert congNhan != null;
            congNhan.setOvertimeMoney(overtimeMoney);
        }
    }

}



