package input;

import checkcondition.CheckNumber;
import logic.QuanLi;
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
        System.out.println("them nhan vien IT");
        System.out.println("nhap id");
        String id =input.nextLine();
        CheckID checkID=new CheckID();
        boolean checkName=checkID.checkID(id);
        if(checkName){
            do {
                System.out.println("Nhap lai ID");
                String ID=input.nextLine();
                checkName=checkID.checkID(ID);
                if(!checkName){
                    id=ID;
                }

            }while (checkName);
        }
        System.out.println("nhap ten");
        String name = input.nextLine();
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("nhap so dien thoai");
       String number = input.nextLine();
       CheckNumber numberCondition=new CheckNumber();
        boolean resultNumber=numberCondition.checkNumber(number);
        if (!resultNumber){
            do {
                System.out.println("nhap lai dung so dien thoai cua viet nam");
                String newNumber=input.nextLine();
                resultNumber= numberCondition.checkNumber(newNumber);
                if (resultNumber){
                    number=newNumber;
                }
            }while (!resultNumber);
        }

        System.out.println("nhap eamil");
        String email = input.nextLine();
        Check check=new Check();
        boolean result = check.checkMail(email);
        if(!result){
            do {
                System.out.println("Nhap lai email dung ");
                String email1 = input.nextLine();
                result = check.checkMail(email1);
                if(result){
                    email = email1;
                }

            }while (!result);
        }
        System.out.println("nhap luong");
        double lc =Double.parseDouble(input.nextLine());
        System.out.println("Nhap thuong");
        double th = Double.parseDouble(input.nextLine());
        System.out.println("nhap phat");
        double pt = Double.parseDouble(input.nextLine());
        System.out.println("nhap chuyen can");
        double cc = Double.parseDouble(input.nextLine());
        System.out.println("nhap ngon ngu");
        String ng = input.next();
        NhanVienIT nhanVienIT = new NhanVienIT(id, name, age, number, email, lc, th, pt, cc, ng);
        return nhanVienIT;



    }


    public NhanVien addNvVP(){
        Scanner input=new Scanner(System.in);
        System.out.println("nhap id");
        String Id = input.nextLine();
        CheckID check=new CheckID();
        boolean checkName=check.checkID(Id);
        if(checkName){
            do {
                System.out.println("Nhap lai ID");
                String ID=input.nextLine();
                checkName=check.checkID(ID);
                if(!checkName){
                    Id=ID;
                }

            }while (checkName);
        }

        System.out.println("nhap ten");
        String name1 = input.nextLine();
        System.out.println("nhap tuoi");
        int Age = Integer.parseInt(input.nextLine());
        System.out.println("nhap so dien thoai");
        String  Number = input.nextLine();
        CheckNumber numberCondition=new CheckNumber();
        boolean resultNumber=numberCondition.checkNumber(Number);
        if (!resultNumber){
            do {
                System.out.println("nhap lai dung so dien thoai cua viet nam");
                String newNumber=input.nextLine();
                resultNumber= numberCondition.checkNumber(newNumber);
                if (resultNumber){
                    Number=newNumber;
                }
            }while (!resultNumber);
        }
        System.out.println("nhap eamil");
        String Email =input.nextLine();
        Check check1=new Check();
        boolean result = check1.checkMail(Email);
        if(!result){
            do {
                System.out.println("Nhap lai email dung ");
                String email1 = input.nextLine();
                result = check1.checkMail(email1);
                if(result){
                    Email = email1;
                }

            }while (!result);
        }
        System.out.println("nhap luong");
        double Lc = Double.parseDouble(input.nextLine());
        System.out.println("Nhap thuong");
        double Th = Double.parseDouble(input.nextLine());
        System.out.println("nhap phat");
        double Pt = Double.parseDouble(input.nextLine());
        System.out.println("nhap vi tri");
        String vt = input.nextLine();
        System.out.println("chuyen nganh");
        String cn = input.nextLine();
        NhanVienVp nhanVienVp = new NhanVienVp(Id, name1, Age, Number, Email, Lc, Th, Pt, vt, cn);
        return nhanVienVp;
    }
    public NhanVien addCN(){
        Scanner input=new Scanner(System.in);
        System.out.println("nhap id");
        String iD = input.nextLine();
         CheckID check=new CheckID();
        boolean checkName= check.checkID(iD);
        if(checkName){
            do {
                System.out.println("Nhap lai ID");
                String ID=input.nextLine();
                checkName=check.checkID(ID);
                if(!checkName){
                    iD=ID;
                }

            }while (checkName);
        }
        System.out.println("nhap ten");
        String Name1 = input.nextLine();
        System.out.println("nhap tuoi");;
        int age1 = Integer.parseInt(input.nextLine());
        System.out.println("nhap so dien thoai");
        String Number1 = input.nextLine();
        CheckNumber numberCondition=new CheckNumber();
        boolean resultNumber=numberCondition.checkNumber(Number1);
        if (!resultNumber){
            do {
                System.out.println("nhap lai dung so dien thoai cua viet nam");
                String newNumber=input.nextLine();
                resultNumber= numberCondition.checkNumber(newNumber);
                if (resultNumber){
                    Number1=newNumber;
                }
            }while (!resultNumber);
        }
        System.out.println("nhap eamil");
        String Email1 = input.nextLine();
        Check check1=new Check();
        boolean result = check1.checkMail(Email1);
        if(!result){
            do {
                System.out.println("Nhap lai email dung ");
                String email1 = input.nextLine();
                result = check1.checkMail(email1);
                if(result){
                    Email1 = email1;
                }

            }while (!result);
        }
        System.out.println("nhap luong");
        double Lc1 = Double.parseDouble(input.nextLine());
        System.out.println("Nhap thuong");
        double Th1 =  Double.parseDouble(input.nextLine());
        System.out.println("thoi gian lam them");
        double Pt1 =  Double.parseDouble(input.nextLine());
        System.out.println("nhap tien tang ca/gio");
        double vt1 =  Double.parseDouble(input.nextLine());
        System.out.println("tien phat");
        double cn1 =  Double.parseDouble(input.nextLine());
        CongNhan congNhan = new CongNhan(iD, Name1, age1, Number1, Email1, Lc1, Th1, Pt1, vt1, cn1);
        return congNhan;
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
     public String number(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap lai so dien thoai");
        String number=scanner.next();
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
         String number = scanner.next();
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
         NhanVienIT nhanVienIT = new NhanVienIT(iD, name, age, number, email, lc, th, pt, cc, ng);
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
         String Number = scanner.next();
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
         NhanVienVp nhanVienVp = new NhanVienVp(id2, name2, Age, Number, Email, Lc, Th, Pt, vt, cn);
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
         String Number1 = scanner.next();
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
         CongNhan congNhan = new CongNhan(ID, Name1, age1, Number1, Email1, Lc1, Th1, Pt1, vt1, cn1);
         return congNhan;
    }


}
