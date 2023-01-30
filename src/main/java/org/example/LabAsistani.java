package org.example;

import java.util.Date;

public class LabAsistani extends Asistan{
    public LabAsistani(String name, String surname, String phone, String email, String bolum, String unvan, String  ofisSaati) {
        super(name, surname, phone, email, bolum, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getName() + "LAB ASİSTANI LABLARA GİRDİ");
    }
    public void derseGir(){
        System.out.println(this.getName() + "LAB ASİSTANI DERSE GİRDİ");
    }
}
