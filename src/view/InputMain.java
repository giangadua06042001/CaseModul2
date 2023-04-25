package view;

import input.Input;
import logic.QuanLi;

import java.util.Scanner;

public class InputMain {
    public InputMain() {
    }

    public void Menu() {
        QuanLi quanLi = new QuanLi();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println();
            System.out.println("""
                    *||-----------------------------------------------------------------||*
                    *||-----------------------------------------------------------------||*
                    *||-----------------------------------------------------------------||*
                    *||                                                                 ||*
                    *||1.them nhan vien                                                 ||*
                    *||2.hien thi                                                       ||*
                    *||3.Tim ten nhan vien theo ten hoac ID:                            ||*
                    *||4.Sua lai nhan vien:                                             ||*
                    *||5.xoa nhan vien theo ID:                                         ||*
                    *||6.Hien Tong luong cua cong ty:                                   ||*
                    *||7.Hien thi tong luong cua tung loai nhan vien:                   ||*
                    *||8.Sap xap theo nhan vien:                                        ||*
                    *||9.Hien thi luong trung binh cua ca cong ty:                      ||*
                    *||10.Hien thi nhan vien co luong thap hon luong trung binh:        ||*
                    *||0.Thoat khoi chuong trinh:                                       ||*
                    *||=================================================================||*         
                    """);
            int choice = getValid(0, 10);
            switch (choice) {
                case 1 -> {
                    System.out.println("Lua chon them loai nhan vien");
                    System.out.println("""
                            a.Them nhan vien IT.
                            b.Them nhan vien van Phong.
                            c.Them cong nhan.
                                           
                            """);
                    String in = scanner.next();
                    switch (in) {
                        case "a" -> {
                            Input input = new Input();
                            quanLi.add(input.addIT());
                            System.out.println("Them nhan vien IT thanh cong");
                        }
                        case "b" -> {
                            Input input = new Input();
                            quanLi.add(input.addNvVP());
                            System.out.println("them nhan vien van phong thanh cong");
                        }
                        case "c" -> {
                            Input input = new Input();
                            quanLi.add(input.addCN());
                            System.out.println("them cong nhan thanh cong");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("hien thi loai nhan vien");
                    System.out.println("""
                            a.Nhan vien It
                            b.Nhan vien Van phong:
                            c.Cong nhan
                                                       
                            """);
                    String in = scanner.next();
                    switch (in) {
                        case "a" -> quanLi.showlistNVIT();
                        case "b" -> quanLi.showlistNVVP();
                        case "c" -> quanLi.showlistCN();
                    }
                }
                case 3 -> {
                    System.out.println("""
                            a.tim tuyet doi theo ID
                            b.Tim kiem tuong doi theo ten
                                                      
                                                       
                            """);
                    String ind = scanner.next();
                    switch (ind) {
                        case "a" -> {
                            System.out.println("Nhap ID");
                            String in = scanner.next();
                            quanLi.Searchid(in);
                        }
                        case "b" -> {
                            System.out.println("nhap ten");
                            String name = scanner.next();
                            quanLi.searchname(name);

                        }

                    }


                }
                case 4 -> {
                    System.out.println("Sua danh sach ");
                    System.out.println("""
                            a.Sua nhan vien IT:
                            b.Sua nhan vien van Phong:
                            c.Sua cong nhan:
                            """);
                    String io = scanner.next();
                    switch (io) {
                        case "a" -> {

                            System.out.println("Nhap ID ban muon sua");
                            String id = scanner.next();
                            System.out.println("Lua chon cach sua");
                            System.out.println("""
                                    1.sua tat ca
                                    2.sua theo thuoc tinh
                                    """);
                            int i = scanner.nextInt();
                            switch (i) {
                                case 1 -> {
                                    Input input = new Input();
                                    quanLi.edit(id, input.editIt());
                                }
                                case 2 -> {
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
                                        case "a" -> {
                                            quanLi.edit(id, quanLi.editNV(id));
                                        }
                                        case "b" -> {
                                            Input ib = new Input();
                                            quanLi.editName(ib.name());
                                        }
                                        case "c" -> {
                                            Input input2 = new Input();
                                            quanLi.editAge(input2.Age());
                                        }
                                        case "d" -> {
                                            Input input3 = new Input();
                                            quanLi.editLuong(input3.wage());
                                        }
                                        case "f" -> {
                                            Input input4 = new Input();
                                            quanLi.editNumber(input4.number());
                                        }
                                        case "g" -> {
                                            Input input5 = new Input();
                                            quanLi.editEmail(input5.email());
                                        }
                                        case "h" -> {
                                            Input input6 = new Input();
                                            quanLi.editThuong(input6.thuong());
                                        }
                                        case "j" -> {
                                            Input input7 = new Input();
                                            quanLi.editPhat(input7.phat());
                                        }
                                        case "k" -> {
                                            Input input8 = new Input();
                                            quanLi.editChuyenCan(input8.chuuyen());
                                        }
                                        case "l" -> {
                                            Input input9 = new Input();
                                            quanLi.editLang(input9.ngon());
                                        }
                                    }
                                }
                                default -> throw new RuntimeException("Nhap lai dung yeu cau");
                            }
                        }
                        case "b" -> {
                            System.out.println("Nhap id ban muon sua");
                            String id1 = scanner.next();
                            System.out.println("""
                                    Lua chon cach sua.
                                    1.sua tat ca
                                    2.sua tung thuoc tinh.
                                    """);
                            int oi = scanner.nextInt();
                            switch (oi) {
                                case 1 -> {
                                    Input input = new Input();
                                    quanLi.edit(id1, input.EditNv());
                                }
                                case 2 -> {
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
                                        case "a" -> {
                                            quanLi.edit(id1, quanLi.editIDVP(id1));
                                            System.out.println("Ban da sua id thanh cong");
                                        }
                                        case "b" -> {
                                            Input input2 = new Input();
                                            quanLi.editNameNVP(input2.name());
                                        }
                                        case "c" -> {
                                            Input input3 = new Input();
                                            quanLi.editAgeNVP(input3.Age());
                                        }
                                        case "d" -> {
                                            Input input4 = new Input();
                                            quanLi.editLuongNVP(input4.wage());
                                        }
                                        case "f" -> {
                                            Input input5 = new Input();
                                            quanLi.editNumberNVP(input5.number());
                                        }
                                        case "g" -> {
                                            Input input6 = new Input();
                                            quanLi.editMailNVP(input6.email());
                                        }
                                        case "h" -> {
                                            Input input7 = new Input();
                                            quanLi.editThuongNVP(input7.thuong());
                                        }
                                        case "j" -> {
                                            Input input8 = new Input();
                                            quanLi.editPhatNVP(input8.phat());
                                        }
                                        case "k" -> {
                                            Input input9 = new Input();
                                            quanLi.editChuyenNVP(input9.nganh());
                                        }
                                        case "l" -> {
                                            Input input10 = new Input();
                                            quanLi.editChucVuNVP(input10.vT());
                                        }
                                    }

                                }
                                default -> throw new IllegalStateException("Unexpected value: " + io);
                            }
                        }
                        case "c" -> {
                            System.out.println("nhap ID ban muon sua");
                            String id3 = scanner.next();
                            System.out.println("""
                                    Lua chon cach sua.
                                    1.Sua tat ca.
                                    2.Sua theo thuoc tinh.
                                                                        
                                    """);
                            int in = scanner.nextInt();
                            switch (in) {
                                case 1 -> {
                                    Input input3 = new Input();
                                    quanLi.edit(id3, input3.EditCn());
                                }
                                case 2 -> {
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
                                    String oi = scanner.next();
                                    switch (oi) {
                                        case "a" -> {
                                            quanLi.edit(id3, quanLi.editIDCN(id3));
                                            System.out.println("Ban da sua id thanh cong");
                                        }
                                        case "b" -> {
                                            Input input1 = new Input();
                                            quanLi.editNameCN(input1.name());
                                        }
                                        case "c" -> {
                                            Input input2 = new Input();
                                            quanLi.editAgeCN(input2.Age());
                                        }
                                        case "d" -> {
                                            Input input4 = new Input();
                                            quanLi.editLuongCN(input4.wage());
                                        }
                                        case "f" -> {
                                            Input input5 = new Input();
                                            quanLi.editNumberCN(input5.number());
                                        }
                                        case "g" -> {
                                            Input input6 = new Input();
                                            quanLi.editEmaiCN(input6.email());
                                        }
                                        case "h" -> {
                                            Input input7 = new Input();
                                            quanLi.editThuongCN(input7.thuong());
                                        }
                                        case "j" -> {
                                            Input input8 = new Input();
                                            quanLi.editPhatCN(input8.phat());
                                        }
                                        case "k" -> {
                                            Input input9 = new Input();
                                            quanLi.thoigianlamthemCN(input9.cnLt());
                                        }
                                        case "l" -> {
                                            Input input10 = new Input();
                                            quanLi.tienlamthemCN(input10.tien());
                                        }
                                    }
                                }
                            }

                        }
                        default -> throw new IllegalStateException("Unexpected value: " + io);

                    }
                }
                case 5 -> {
                    quanLi.showNhanvien();
                    System.out.println("nhap ai ban muon xoa");
                    String id = scanner.next();
                    quanLi.search(id);
                    System.out.println("a.xac nhan " +
                            "b.huy bo lenh");
                    String x = scanner.next();
                    if (x.equals("a")) {
                        quanLi.delete(id);
                        System.out.println("Xoa thanh cong");
                    } else if (x.equals("b")) {
                        System.out.println("Da huy bo thanh cau lenh");
                    }


                }
                case 6 -> {
                    System.out.println("Tong luong cua ca cong ty" + " :" + quanLi.total());

                }
                case 7 -> {
                    System.out.println("""
                            a.Tong luong cua nhan vien IT:
                            b.Tong luong cua nhan vien Vp:
                            c.Tong luong cua cong nhan:
                            """);
                    String oai = scanner.next();

                    switch (oai) {
                        case "a" -> {
                            System.out.println("Tong luong cua nhan vien IT la:" + quanLi.salaryNVIT());
                        }
                        case "b" -> {
                            System.out.println("tong luong vua nhan vien van phong" + " :" + quanLi.salaryNVVP());
                        }
                        case "c" -> {
                            System.out.println("tong luong cua cong nhan" + " :" + quanLi.salaryCN());
                        }
                    }
                }
                case 8 -> {
                    quanLi.SapXep();
                    System.out.println(quanLi.SapXep());
                }
                case 9 -> {
                    System.out.println("luong trung binh cua ca cong ty : " + " " + quanLi.LTB());
                }
                case 10 -> {
                    System.out.println("Danh sach nhan vien luong thap hon luong trung binh cua cong ty la");
                    System.out.println(quanLi.danhsach());

                }
                case 0 -> {
                    System.exit(0);

                }
                default -> {
                    System.out.println("lua chon k hop le vui long chon lai");
                }
            }
        } while (true);

    }


    public static int getValid(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Nhập lựa chọn của bạn: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= min && choice <= max) {
                    scanner.nextLine();
                    return choice;
                }
            }
            System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại! ");
            scanner.nextLine();

        }


    }
}

