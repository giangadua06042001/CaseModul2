package mota;

import java.io.Serializable;

public class CongNhan extends NhanVien implements Serializable {
    private double salary;
    private double bonus;
    private double overtime;
    private double overtimeMoney;
    private double punish;

    public CongNhan(String id, String name, int age, String number, String email, double salary, double bonus, double overtime, double overtimeMoney, double punish) {
        super(id, name, age, number, email);
        this.salary = salary;
        this.bonus = bonus;
        this.overtime = overtime;
        this.overtimeMoney = overtimeMoney;
        this.punish = punish;
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

    public double overtime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double overtimeMoney() {
        return overtimeMoney;
    }

    public void setOvertimeMoney(double overtimeMoney) {
        this.overtimeMoney = overtimeMoney;
    }

    public double punish() {
        return punish;
    }

    public void setPunish(double punish) {
        this.punish = punish;
    }

    @Override
    public double Payroll() {
        double total=this.bonus+this.salary+this.overtime*this.overtimeMoney-this.punish;
        return total;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
