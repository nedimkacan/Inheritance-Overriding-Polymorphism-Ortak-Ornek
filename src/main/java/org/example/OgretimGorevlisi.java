package org.example;

public class OgretimGorevlisi extends Akademisyen{
    private int kapiNo;

    public OgretimGorevlisi(String name, String surname, String phone, String email, String bolum, String unvan,int kapiNo) {
        super(name, surname, phone, email, bolum, unvan);
        this.kapiNo = kapiNo;
    }
    public int getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }
    public void senatoToplanti(){
        System.out.println(this.getName() + "ÖĞRETİM GÖREVLİSİ SENATO TOPLANTISI YAPTI");
    }
    public void sinavYap(){
        System.out.println(this.getName() + "ÖĞRETİM GÖREVLİSİ SINAV YAPTI");
    }
}
