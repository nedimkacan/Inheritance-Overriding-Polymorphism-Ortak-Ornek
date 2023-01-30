package org.example;

public class Asistan extends Akademisyen{
    private String ofisSaati;

    public Asistan(String name, String surname, String phone, String email, String bolum, String unvan,String ofisSaati) {
        super(name, surname, phone, email, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
    public void quizYap(){
        System.out.println(this.getName() + "ASİSTAN QUİZ YAPTI");
    }
}
