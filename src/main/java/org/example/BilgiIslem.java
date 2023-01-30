package org.example;

public class BilgiIslem extends Memur{
    private String gorev;

    public BilgiIslem(String name, String surname, String phone, String email, String departman, String mesai,String gorev) {
        super(name, surname, phone, email, departman, mesai);
        this.gorev=gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
    public void networkKurulumu(){
        System.out.println(this.gorev + "BİLGİ İŞLEM MEMURU NETWORK KURDU");
    }
}
