package view;

import input.Input;
import logic.QuanLi;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        QuanLi quanLi = new QuanLi();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                    *-----------------------------------------------------------------*
                    *1.them nhan vien                                                 *
                    *2.hien thi                                                       *
                    *3.Tim ten nhan vien theo ten hoac ID:                            *
                    *4.Sua lai nhan vien:                                             *
                    *5.xoa nhan vien theo ID:                                         *
                    *6.Hien Tong luong cua cong ty:                                   *
                    *7.Hien thi tong luong cua tung loai nhan vien:                   *
                    *8.Sap xap theo nhan vien:                                        *
                    *9.Hien thi luong trung binh cua ca cong ty:                      *
                    *10.Hien thi nhan vien co luong thap hon luong trung binh:        *
                    *0.Thoat khoi chuong trinh:                                       *
                    *-----------------------------------------------------------------*         
                    """);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Lua chon them loai nhan vien");
                    System.out.println("""
                            a.Them nhan vien IT.
                            b.Them nhan vien van Phong.
                            c.Them cong nhan.
                                           
                            """);
                    String in = scanner.next();
                    switch (in) {
                        case "a": {
                            Input input = new Input();
                            quanLi.add(input.addIT());
                            break;
                        }
                        case "b": {
                            Input input = new Input();
                            quanLi.add(input.addNvVP());
                            break;
                        }
                        case "c": {
                            Input input = new Input();
                            quanLi.add(input.addCN());
                            break;
                        }
                    }
                }
                break;

                case 2: {
                   System.out.println("hien thi loai nhan vien");
                   System.out.println("""
                           a.Nhan vien It
                           b.Nhan vien Van phong:
                           c.Cong nhan
                           
                           """);
                   String in=scanner.next();
                   switch (in){
                       case "a":
                           quanLi.showlistNVIT();
                           break;
                       case "b":
                           quanLi.showlistNVVP();
                           break;
                       case "c":
                           quanLi.showlistCN();
                           break;

                   }
                }
                break;
                case 3: {
                    System.out.println("nhap id ma may can tim");
                    String Id = scanner.next();
                    quanLi.search(Id);

                }
                break;
                case 4: {
                    System.out.println("Sua danh sach ");
                    System.out.println("""
                            a.Sua nhan vien IT:
                            b.Sua nhan vien van Phong:
                            c.Sua cong nhan:
                            """);
                    String io = scanner.next();
                    switch (io) {
                        case "a": {

                            System.out.println("Nhap ID ban muon sua");
                            String id = scanner.next();
                            System.out.println("Lua chon cach sua");
                            System.out.println("""
                                    1.sua tat ca
                                    2.sua theo thuoc tinh
                                    """);
                            int i = scanner.nextInt();
                            switch (i) {
                                case 1:
                                    Input input = new Input();
                                    quanLi.edit(id, input.editIt());
                                    break;
                                case 2:
                                    System.out.println("Lua chon thuoc tinh ban muon sua lai");
                                    System.out.println("""
                                            a.ID
                                            b.Ho va ten
                                            c.Tuoi
                                            d.Luong
                                            f.So dien thoai
                                            g.Email
                                            h.thuong
                                            j.phat
                                            k.chuyen can
                                            l.ngon ngu.
                                            """);
                                    String name = scanner.next();
                                    switch (name) {
                                        case "a":
                                            Input input1 = new Input();
                                            quanLi.editNV(input1.getidIT());
                                            break;
                                        case "b":
                                            Input ib = new Input();
                                            quanLi.editName(ib.name());
                                            break;
                                        case "c":
                                            Input input2 = new Input();
                                            quanLi.editAge(input2.Age());
                                            break;
                                        case "d":
                                            Input input3 = new Input();
                                            quanLi.editLuong(input3.wage());
                                            break;
                                        case "f":
                                            Input input4 = new Input();
                                            quanLi.editNumber(input4.number());
                                            break;
                                        case "g":
                                            Input input5 = new Input();
                                            quanLi.editEmail(input5.email());
                                            break;
                                        case "h":
                                            Input input6 = new Input();
                                            quanLi.editThuong(input6.thuong());
                                            break;
                                        case "j":
                                            Input input7 = new Input();
                                            quanLi.editPhat(input7.phat());
                                            break;
                                        case "k":
                                            Input input8 = new Input();
                                            quanLi.editChuyenCan(input8.chuuyen());
                                            break;
                                        case "l":
                                            Input input9 = new Input();
                                            quanLi.editLang(input9.ngon());
                                            break;
                                    }
                            }
                            break;
                        }
                        case "b": {
                            System.out.println("Nhap id ban muon sua");
                            String id1 = scanner.next();
                            System.out.println("""
                                    Lua chon cach sua.
                                    1.sua tat ca
                                    2.sua tung thuoc tinh.
                                    """);
                            int oi = scanner.nextInt();
                            switch (oi) {
                                case 1:
                                    Input input = new Input();
                                    quanLi.edit(id1, input.EditNv());
                                    break;
                                case 2:
                                    System.out.println("lua chon thuoc tinh de sua.");
                                    System.out.println("""
                                                             a.ID
                                                           b.Ho va ten
                                                           c.Tuoi
                                                           d.Luong
                                                           f.So dien thoai
                                                           g.Emai
                                                           h.thuong
                                                           j.phat
                                                           k.chuyen nganh
                                                           l.chuc vu
                                                                                            
                                            """);
                                    String moi = scanner.next();
                                    switch (moi) {
                                        case "a":
                                            Input input1 = new Input();
                                            quanLi.editNVP(input1.getidIT());
                                            break;
                                        case "b":
                                            Input input2 = new Input();
                                            quanLi.editNameNVP(input2.name());
                                            break;
                                        case "c":
                                            Input input3 = new Input();
                                            quanLi.editAgeNVP(input3.Age());
                                            break;
                                        case "d":
                                            Input input4 = new Input();
                                            quanLi.editLuongNVP(input4.wage());
                                            break;
                                        case "f":
                                            Input input5 = new Input();
                                            quanLi.editNumberNVP(input5.number());
                                            break;
                                        case "g":
                                            Input input6 = new Input();
                                            quanLi.editMailNVP(input6.email());
                                            break;
                                        case "h":
                                            Input input7 = new Input();
                                            quanLi.editThuongNVP(input7.thuong());
                                            break;
                                        case "j":
                                            Input input8 = new Input();
                                            quanLi.editPhatNVP(input8.phat());
                                            break;
                                        case "k":
                                            Input input9 = new Input();
                                            quanLi.editChuyenNVP(input9.nganh());
                                            break;
                                        case "l":
                                            Input input10 = new Input();
                                            quanLi.editChucVuNVP(input10.vT());
                                            break;

                                    }
                            }

                        }
                        break;
                        case "c": {
                            System.out.println("nhap ID ban muon sua");
                            String id3 = scanner.next();
                            System.out.println("""
                                    Lua chon cach sua.
                                    1.Sua tat ca.
                                    2.Sua theo thuoc tinh.
                                    
                                    """);
                            int in=scanner.nextInt();
                            switch (in){
                                case 1:
                                    Input input3 = new Input();
                                    quanLi.edit(id3, input3.EditCn());
                                    break;
                                case 2:
                                    System.out.println("""
                                            lua chon thuoc tinh de sua.
                                                           a.ID
                                                           b.Ho va ten
                                                           c.Tuoi
                                                           d.Luong
                                                           f.So dien thoai
                                                           g.Emai
                                                           h.thuong
                                                           j.phat:
                                                           k.thoi gian lam them:
                                                           l.tien lam them/h:
                                            
                                       
                                            """);
                                    String oi=scanner.next();
                                    switch (oi){
                                        case "a":
                                            Input input=new Input();
                                            quanLi.editIdCN(input.getidIT());
                                            break;
                                        case "b":
                                            Input input1=new Input();
                                            quanLi.editNameCN(input1.name());
                                            break;
                                        case "c":
                                            Input input2=new Input();
                                            quanLi.editAgeCN(input2.Age());
                                            break;
                                        case"d":
                                            Input input4=new Input();
                                            quanLi.editLuongCN(input4.wage());
                                            break;
                                        case"f":
                                            Input input5=new Input();
                                            quanLi.editNumberCN(input5.number());
                                            break;
                                        case "g":
                                            Input input6=new Input();
                                            quanLi.editEmaiCN(input6.email());
                                            break;
                                        case "h":
                                            Input input7=new Input();
                                            quanLi.editThuongCN(input7.thuong());
                                            break;
                                        case "j":
                                            Input input8=new Input();
                                            quanLi.editPhatCN(input8.phat());
                                            break;
                                        case "k":
                                            Input input9=new Input();
                                            quanLi.thoigianlamthemCN(input9.cnLt());
                                            break;
                                        case "l":
                                            Input input10=new Input();
                                            quanLi.tienlamthemCN(input10.tien());
                                            break;
                                    }

                            }



                        }
                    }

                }
                break;

                case 5: {
                    System.out.println("Lua chon loai nhan vien muon xoa");
                    System.out.println("""
                            a.Nhan vien It
                            b.Nhan vien Van Phong
                            c.Cong nhan
                            """);
                    String in=scanner.next();
                    switch (in){
                        case "a":
                            System.out.println("nhap id ban muon xoa");
                            String id=scanner.next();
                            quanLi.delete(id);
                            break;
                        case "b":
                            System.out.println("nhap id ban muon xoa");
                            String id1=scanner.next();
                            quanLi.deleteNVVP(id1);
                            break;
                        case "c":
                            System.out.println("Nhap id ban muon xoa");
                            String id2=scanner.next();
                            quanLi.deleteCN(id2);
                            break;
                    }


                }
                break;
                case 6: {
                    System.out.println("Tong luong cua ca cong ty" + " :" + quanLi.total());

                }
                break;
                case 7: {
                    System.out.println("""
                            a.Tong luong cua nhan vien IT:
                            b.Tong luong cua nhan vien Vp:
                            c.Tong luong cua cong nhan:
                            """);
                    String oai = scanner.next();

                    switch (oai) {
                        case "a": {
                            System.out.println("Tong luong cua nhan vien IT la:" + quanLi.salaryNVIT());
                            break;
                        }
                        case "b": {
                            System.out.println("tong luong vua nhan vien van phong" + " :" + quanLi.salaryNVVP());
                            break;
                        }
                        case "c": {
                            System.out.println("tong luong cua cong nhan" + " :" + quanLi.salaryCN());
                            break;
                        }
                    }
                }
                break;
                case 8: {
                    quanLi.SapXep();
                    break;
                }

                case 9: {
                    System.out.println("luong trung binh cua ca cong ty : " + " " + quanLi.LTB());
                }
                break;
                case 10: {
                    System.out.println("Danh sach nhan vien luong thap hon luong trung binh cua cong ty la");
                    System.out.println(quanLi.danhsach());

                }
                break;
                case 0: {
                    System.exit(0);

                }
            }
        } while (true);


    }
}

