package view;

import input.Input;
import logic.QuanLi;

import java.util.Scanner;

public class MenuAccountant {
    public MenuAccountant() {
    }

    public void Menu() {
        QuanLi quanLi = new QuanLi();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("""
                    ********************************************
                        LUA CHON CUA BAN
                    1.Them danh sach nhan vien
                    2.Hien thi danh sach nhan vien:
                    3.Tim nhan vien 
                    4.Hien Tong luong cua cong ty:                                   ||*
                    5.Hien thi tong luong cua tung loai nhan vien:                   ||*
                    6.Sap xap theo nhan vien:                                        ||*
                    7.Hien thi luong trung binh cua ca cong ty:                      ||*
                    8.Hien thi nhan vien co luong thap hon luong trung binh:        ||*
                    0.Thoat khoi chuong trinh:     
                                        
                                        
                    """);
            int choice = getValid(1, 8);
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
                    System.out.println("Tong luong cua ca cong ty" + " :" + quanLi.total());

                }
                case 5 -> {
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
                case 6 -> {
                    quanLi.SapXep();
                    System.out.println(quanLi.SapXep());
                }
                case 7 -> {
                    System.out.println("luong trung binh cua ca cong ty : " + " " + quanLi.LTB());
                }
                case 8 -> {
                    System.out.println("Danh sach nhan vien luong thap hon luong trung binh cua cong ty la");
                    System.out.println(quanLi.danhsach());

                }
                case 0 -> {
                    System.exit(0);
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
