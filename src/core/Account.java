package core;

public class Account {
    private static int samplacc = 1001;
    private int accno;
    private String name;
    private String city;
    private int bal;

    public Account(String name, String city, int bal) {
        this.accno = samplacc++;
        this.name = name;
        this.city = city;
        this.bal = bal;
    }

    public static int getSamplacc() {
        return samplacc;
    }

    public static void setSamplacc(int samplacc) {
        Account.samplacc = samplacc;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "[accno=" + accno + ", name=" + name + ", city=" + city + ", bal=" + bal + "]";
    }
}
