package org.example;

public class GuvenlikGorevlisi extends Memur{
    private String belge;

    public GuvenlikGorevlisi(String name, String surname, String phone, String email, String departman, String mesai,String belge) {
        super(name, surname, phone, email, departman, mesai);
        this.belge = belge;
    }
    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
    public void nobet(){
        System.out.println(this.getName() + "GÜVENLİK GÖREVLİSİ NOBET TUTTU");
    }
}
