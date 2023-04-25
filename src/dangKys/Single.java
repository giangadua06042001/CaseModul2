package dangKys;

import readWritefile.ReadFileUser;
import readWritefile.WriteUser;
import view.InputMain;
import view.MenuAccountant;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Single implements Serializable {
    private List<Manager> signins;
    ReadFileUser readFileUser=new ReadFileUser();


    public Single() {
        this.signins = readFileUser.readFile();
    }

    public Single(List<Manager> signins) {
        this.signins = signins;
    }

    public void add(Manager signin) {
        signins.add(signin);
        WriteUser.writeFile(signins);



    }

    public void dN(String email, String paswolsd, String persition) {
        for (Manager s1 : signins) {
            if (s1.password().equals(paswolsd) && s1.name().equals(email) && s1.position().equals(persition)) {
                InputMain inputMain = new InputMain();
                inputMain.Menu();
            } else if (s1.name().equals(email) && s1.password().equals(paswolsd)) {
                MenuAccountant menuAccountant = new MenuAccountant();
                menuAccountant.Menu();
            }
            else {
                System.out.println("nhap lai dung mat khau");
            }

        }
    }


    public boolean checkMail(String mail) {
        boolean check = true;
        for (Manager sn : signins) {
            if (sn.name().equals(mail)) {
                check = false;
                System.out.println("Email da duoc dang ky");
            } else {
                check = true;
            }

        }
        return check;
    }

    public int getValid(int min, int max) {
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
