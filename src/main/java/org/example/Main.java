package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calisan calisan1=new Calisan("SELİM ","KARA","0535645789","selim@gmail.com");
        calisan1.giris();

        Akademisyen akademisyen1=new Akademisyen(
                "FATİH ",
                "KARA",
                "04657894564",
                "fatih@gmail.com",
                "FİZİK",
                "DOÇENT"
        );
        akademisyen1.derseGir();
        akademisyen1.cikis();

        Memur memur1=new Memur(
                "Kemal ",
                "Kükret",
                "09875641245",
                "kemal@gmail.com",
                "BİYOLOJİ",
                "PROFESÖR"
        );
        memur1.calis();

        OgretimGorevlisi ogretimGorevlisi1=new OgretimGorevlisi(
                "Ayşe",
                "Dörtdirek",
                "0456789465",
                "ayse@gmail.com",
                "KİMYA",
                "OĞRETİM GÖREVLİSİ",
                45
        );
        ogretimGorevlisi1.senatoToplanti();
        ogretimGorevlisi1.sinavYap();

        Asistan asistan1=new Asistan(
                "Sadi",
                "Konyalı",
                "045649879560",
                "sadi@gmail.com",
                "KİMYA",
                "ASİSTAN",
                "12:30"
        );
        asistan1.quizYap();

        LabAsistani labAsistani1=new LabAsistani(
                "Sultan",
                "Kara",
                "045648978765",
                "sultan@gmail.com",
                "KİMYA",
                "LAB ASİSTANI",
                "17,30"
        );
        labAsistani1.derseGir();
    }
}