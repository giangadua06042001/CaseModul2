package mota;

import java.io.Serializable;

public class NhanVienIT extends NhanVien implements Serializable {

    private double salary;
    private double bonus;
    private double  punish;
    private double  attendanceMoney;
    private String language;

    public NhanVienIT() {
    }

    public NhanVienIT(String id, String name, int age, double wage, int number, String email, double salary, double bonus, double punish, double attendanceMoney, String language) {
        super(id, name, age, wage, number, email);
        this.salary=salary;
        this.bonus=bonus;
        this.punish=punish;
        this.attendanceMoney=attendanceMoney;
        this.language=language;
    }

    @Override
    public double Payroll() {
        double total=this.salary+this.attendanceMoney+this.bonus-this.punish;
        return total;
    }

    public String language() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double salary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double bonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double punish() {
        return punish;
    }

    public void setPunish(double punish) {
        this.punish = punish;
    }

    public double attendanceMoney() {
        return attendanceMoney;
    }

    public void setAttendanceMoney(double attendanceMoney) {
        this.attendanceMoney = attendanceMoney;
    }

    @Override
    public String toString() {
        return super.toString()+
                "salary= "+salary
                +"bonus= "+bonus
                +"punish "+punish
                +"attendanceMoney= "+attendanceMoney
                +"language="+language;



    }
}
