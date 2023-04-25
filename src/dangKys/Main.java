package dangKys;

import input.Check;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Single single = new Single();

        do {
            System.out.println("lua chon cua quy khac");
            System.out.println("1.Dang ky tai khoan\n"
                    + "2.Dang nhap\n"
                    + "0.thoat khoi chuong trinh"
            );
            int checked = single.getValid(1, 2);
            switch (checked) {
                case 1:
                    System.out.println("Dang ky tai khoan moi");
                    System.out.println("Hay dang ky theo from");
                    System.out.println("Nhap email theo yeu cau");
                    System.out.println();
                    System.out.println();
                    System.out.println("hay nhap email");
                    String email = scanner.nextLine();
                    single.checkMail(email);
                    Check check1 = new Check();
                    boolean result = check1.checkMail(email);
                    if (!result) {
                        do {
                            System.out.println("Nhap lai email dung ");
                            String email1 = scanner.nextLine();
                            result = check1.checkMail(email1);
                            if (result) {
                                email = email1;
                            }

                        } while (!result);
                    }
                    System.out.println("nhap mat khau");
                    String pass = scanner.nextLine();
                    System.out.println("nhap chuc vu");
                    String persition=scanner.nextLine();
                    Manager signin = new Manager(email, pass,persition);
                    single.add(signin);
                    System.out.println("lua chon cua quy khach\n");
                    System.out.println("a.dang nhap\n" +
                            "           b.thoat khoi chuong trinh\n");

                    String choi = scanner.nextLine();
                    boolean check = false;
                    while (!check) {
                        switch (choi) {
                            case "a":
                                System.out.println("nhap lai mail");
                                String mail = scanner.nextLine();
                                System.out.println("nhap lai mat khau");
                                String password = scanner.nextLine();
                                System.out.println("nhap lai chuc vu");
                                String persiton=scanner.nextLine();
                                single.dN(mail, password,persiton);
                            case "b":
                                check = true;
                        }
                    }
                    break;

                case 2:
                    System.out.println("dang nhap ");
                    System.out.println("nhap email");
                    String email1 = scanner.nextLine();
                    System.out.println("nhap mat khau");
                    String password = scanner.nextLine();
                    System.out.println("hay nhap chuc vu");
                    String persiton=scanner.nextLine();
                    Single single1 = new Single();
                    single1.dN(email1, password,persiton);
                case 0:
                    System.exit(0);
            }
        }
        while (true);
    }
}

