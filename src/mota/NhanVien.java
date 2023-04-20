package mota;

public class NhanVien{
    private String id;
    private String name;
    private int age;
    private double wage;
    private int number;
    private String email;

    public NhanVien() {
    }

    public NhanVien(String id, String name, int age, double wage, int number, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.number=number;
        this.email=email;
    }

    public int number() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double wage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    public double Payroll(){
        return 0;
    }


    @Override
    public String toString() {
        return "NhanVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", wage=" + wage +
                ", number=" + number +
                ", email= " + email ;
    }



    }

