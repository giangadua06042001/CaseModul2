package input;

import mota.CongNhan;
import mota.NhanVien;
import mota.NhanVienIT;
import mota.NhanVienVp;
import readWritefile.WriteToFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private List<NhanVien>nhanViens=new ArrayList<>();

    public Input() {
    }
    public NhanVien addIT(){
        Scanner input=new Scanner(System.in);
        System.out.println("nhap id");
        System.out.println("them nhan vien IT");
        System.out.println("nhap id");
        String id = input.next();
        System.out.println("nhap ten");
        String name = input.next();
        System.out.println("nhap tuoi");
        input.nextLine();
        int age = input.nextInt();
        System.out.println("Nhap luong");
        double wage = input.nextDouble();
        System.out.println("nhap so dien thoai");
        int number = input.nextInt();
        System.out.println("nhap eamil");
        String email = input.nextLine();
        input.next();
        System.out.println("nhap luong");
        double lc = input.nextDouble();
        System.out.println("Nhap thuong");
        double th = input.nextDouble();
        System.out.println("nhap phat");
        double pt = input.nextDouble();
        System.out.println("nhap chuyen can");
        double cc = input.nextDouble();
        System.out.println("nhap ngon ngu");
        String ng = input.next();
        NhanVienIT nhanVienIT = new NhanVienIT(id, name, age, wage, number, email, lc, th, pt, cc, ng);
        return nhanVienIT;
    }
    public NhanVien addNvVP(){
        Scanner input=new Scanner(System.in);
        System.out.println("nhap id");
        String Id = input.next();
        System.out.println("nhap ten");
        String name1 = input.next();
        System.out.println("nhap tuoi");
        input.nextLine();
        int Age = input.nextInt();
        System.out.println("Nhap luong");
        double Wage = input.nextDouble();
        System.out.println("nhap so dien thoai");
        int Number = input.nextInt();
        System.out.println("nhap eamil");
        String Email = input.nextLine();
        input.next();
        System.out.println("nhap luong");
        double Lc = input.nextDouble();
        System.out.println("Nhap thuong");
        double Th = input.nextDouble();
        System.out.println("nhap phat");
        double Pt = input.nextDouble();
        System.out.println("nhap vi tri");
        String vt = input.next();
        System.out.println("chuyen nganh");
        String cn = input.next();
        NhanVienVp nhanVienVp = new NhanVienVp(Id, name1, Age, Wage, Number, Email, Lc, Th, Pt, vt, cn);
        return nhanVienVp;
    }
    public NhanVien addCN(){
        Scanner input=new Scanner(System.in);
        System.out.println("nhap id");
        String ID = input.next();
        System.out.println("nhap ten");
        String Name1 = input.next();
        System.out.println("nhap tuoi");
        input.nextLine();
        int age1 = input.nextInt();
        System.out.println("Nhap luong");
        double Wage1 = input.nextDouble();
        System.out.println("nhap so dien thoai");
        int Number1 = input.nextInt();
        System.out.println("nhap eamil");
        String Email1 = input.nextLine();
        input.next();
        System.out.println("nhap luong");
        double Lc1 = input.nextDouble();
        System.out.println("Nhap thuong");
        double Th1 = input.nextDouble();
        System.out.println("thoi gian lam them");
        double Pt1 = input.nextDouble();
        System.out.println("nhap tien tang ca/gio");
        double vt1 = input.nextDouble();
        System.out.println("tien phat");
        double cn1 = input.nextDouble();
        CongNhan congNhan = new CongNhan(ID, Name1, age1, Wage1, Number1, Email1, Lc1, Th1, Pt1, vt1, cn1);
        return congNhan;
    }
     public String getidIT(){
        Scanner scanner=new Scanner(System.in);
     System.out.println("Nhap lai Id");
     String id=scanner.nextLine();
     return id;
     }
     public String name(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai ten sau khi sua");
        String name=scanner.nextLine();
        return name;
     }
     public int Age(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai tuoi sau khi vao");
        int age=scanner.nextInt();
        return age;
     }
     public double wage(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap lai luong");
        double wage=scanner.nextDouble();
        return wage;
     }
     public int number(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai so dien thoai");
        int number=scanner.nextInt();
        return number;
     }
     public String email(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai email");
        String email=scanner.nextLine();
        return email;
     }
     public double thuong(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai thuong");
        double thuong=scanner.nextDouble();
        return thuong;
     }
     public double phat(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai phat");
        double phat=scanner.nextDouble();
        return phat;
     }
     public double cnLt(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai  gio lam them");
        double gl=scanner.nextDouble();
        return gl;
     }
     public double tien(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai tien lam them/gio");
        double gio=scanner.nextInt();
        return gio;
     }
     public double chuuyen(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai chuyen can");
        double chuyen=scanner.nextDouble();
        return chuyen;
     }
     public String ngon(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai ngon ngu");
        String ngon=scanner.next();
        return ngon;
     }
     public String vT(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai vi tri");
        String vt=scanner.next();
        return vt;
     }
     public String nganh(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai chuyen nganh");
        String nganh=scanner.next();
        return nganh;
     }
     public NhanVien editIt(){
        Scanner scanner=new Scanner(System.in);
         System.out.println("them nhan vien IT");
         System.out.println("nhap id");
         String iD = scanner.next();
         System.out.println("nhap ten");
         String name = scanner.next();
         System.out.println("nhap tuoi");
         scanner.nextLine();
         int age = scanner.nextInt();
         System.out.println("Nhap luong");
         double wage = scanner.nextDouble();
         System.out.println("nhap so dien thoai");
         int number = scanner.nextInt();
         System.out.println("nhap eamil");
         String email = scanner.next();
         System.out.println("nhap luong");
         double lc = scanner.nextDouble();
         System.out.println("Nhap thuong");
         double th = scanner.nextDouble();
         System.out.println("nhap phat");
         double pt = scanner.nextDouble();
         System.out.println("nhap chuyen can");
         double cc = scanner.nextDouble();
         System.out.println("nhap ngon ngu");
         String ng = scanner.next();
         NhanVienIT nhanVienIT = new NhanVienIT(iD, name, age, wage, number, email, lc, th, pt, cc, ng);
         return nhanVienIT;
     }
     public NhanVien EditNv(){
        Scanner scanner=new Scanner(System.in);
         System.out.println("nhap id");
         String id2 = scanner.next();
         System.out.println("nhap ten");
         String name2 = scanner.next();
         System.out.println("nhap tuoi");
         scanner.nextLine();
         int Age = scanner.nextInt();
         System.out.println("Nhap luong");
         double Wage = scanner.nextDouble();
         System.out.println("nhap so dien thoai");
         int Number = scanner.nextInt();
         System.out.println("nhap eamil");
         String Email = scanner.next();
         System.out.println("nhap luong");
         double Lc = scanner.nextDouble();
         System.out.println("Nhap thuong");
         double Th = scanner.nextDouble();
         System.out.println("nhap phat");
         double Pt = scanner.nextDouble();
         System.out.println("nhap vi tri");
         String vt = scanner.next();
         System.out.println("chuyen nganh");
         String cn = scanner.next();
         NhanVienVp nhanVienVp = new NhanVienVp(id2, name2, Age, Wage, Number, Email, Lc, Th, Pt, vt, cn);
         return nhanVienVp;
     }
     public NhanVien EditCn(){
        Scanner scanner=new Scanner(System.in);
         System.out.println("nhap id");
         String ID = scanner.next();
         System.out.println("nhap ten");
         String Name1 = scanner.next();
         System.out.println("nhap tuoi");
         scanner.nextLine();
         int age1 = scanner.nextInt();
         System.out.println("Nhap luong");
         double Wage1 = scanner.nextDouble();
         System.out.println("nhap so dien thoai");
         int Number1 = scanner.nextInt();
         System.out.println("nhap eamil");
         String Email1 = scanner.nextLine();
         scanner.next();
         System.out.println("nhap luong");
         double Lc1 = scanner.nextDouble();
         System.out.println("Nhap thuong");
         double Th1 = scanner.nextDouble();
         System.out.println("thoi gian lam them");
         double Pt1 = scanner.nextDouble();
         System.out.println("nhap tien tang ca/gio");
         double vt1 = scanner.nextDouble();
         System.out.println("tien phat");
         double cn1 = scanner.nextDouble();
         CongNhan congNhan = new CongNhan(ID, Name1, age1, Wage1, Number1, Email1, Lc1, Th1, Pt1, vt1, cn1);
         return congNhan;
     }


}
