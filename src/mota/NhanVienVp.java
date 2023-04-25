package mota;

import java.io.Serializable;

public class NhanVienVp extends NhanVien implements Serializable {
    private double salary;
    private double bonus;
    private double punish;
    private String location;
    private String specialized;

    public NhanVienVp() {
    }

    public NhanVienVp(String id, String name, int age, String number, String email, double salary, double bonus, double punish, String location, String specialized) {
        super(id, name, age, number, email);
        this.salary=salary;
        this.bonus=bonus;
        this.punish=punish;
        this.location=location;
        this.specialized=specialized;
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

    public String location() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String specialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public double Payroll() {
        double total=salary+bonus-punish;
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+"salary="+" "+salary
                               +"bonus="+" "+bonus
                               +"punish= "+punish
                               +"Location= "+" "+location
                               +"specialize= "+" "+specialized;



    }
}
