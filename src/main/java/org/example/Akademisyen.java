package org.example;

public class Akademisyen extends Calisan{
    public String bolum;
    public String unvan;

    public Akademisyen(String name, String surname, String phone, String email, String bolum, String unvan) {
        super(name, surname, phone, email);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public void derseGir(){
        System.out.println(this.getName() + "AKADEMİSYEN DERSE GİRDİ");
    }
}
