package org.example;

public class Calisan {
    private String name;
    private String surname;
    private String phone;
    private String email;

    public Calisan(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void giris(){
        System.out.println(this.name + "GİRİŞ YAPILDI");
    }
    public void cikis(){
        System.out.println(this.name + "ÇIKIŞ YAPILDI");
    }
    public void yemekhane(){
        System.out.println(this.name + "YEMEKHANEDEN YEMEK YİYİLDİ");
    }
}
