package org.example;

public class Memur extends Calisan{
    public String departman;
    public String mesai;

    public Memur(String name, String surname, String phone, String email, String departman, String mesai) {
        super(name, surname, phone, email);
        this.departman=departman;
        this.mesai=mesai;
    }


    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
    public void calis(){
        System.out.println(this.getName() + "MEMUR ÇALIŞTI");
    }
}
