package d2_variables;

public class Variables01 {
    public static void main(String[] args) {
        //Java bu satırı okumaz. Kendimize veya başkasına açıklamadır
        /*
         1) Java dili Strongly Typed'dir, bu nedenle Java'daki her değişken(variable), belirli
        veri türü(data type) ile iliskilendirilmelidir.
        2) Kod yazanin değişkenlere uygun değerlerin atandığından emin olması her zaman gerekir.
        Aksi takdirde hata oluşur.
         */
        //Ornek 1: String data tipinde ismi hi olan bir variable olusturarak,
        // icine “Hello World” yukleyip console’a yazdiriniz.

        //Sıralama nasıl olacaktı?
        // data type ==>  variable name ==>  atama operatörü ==> data ==> noktalı virgül

        String hi = "Hello World";

        System.out.println(hi);

        //Örnek2 : Tamsayı(int) data tipinde ismi age olan bir variable oluşturunuz
        //ve içine 15 yükleyip console a yazdırınız

        int age = 15;
        System.out.println(age);

        /*Java Primitive Data Types:
        Not 1 : primitive data type'larini Java olusturmustur, biz olusturamayiz
        Not 2 : primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
        Not 3 : primitive datalar, data type'larina gore memory'de farkli farkli yer kaplarlar
        Not 4 : primitive datalar, iclerinde sadece sizin atadiginiz degeri barindirirlar*/

        //1- byte data type:
        //tam sayilar icindir. Hafizada 1 byte(8 bit) yer kaplar
        //-128 den + 127’e tamsayi degerleri icin kullanilir

        //Ornek 1 : byte data tipinde ogrenci yasi icin bir variable olusturun ve deger atayin.

        byte ogrenciyasi = 23;
        System.out.println(ogrenciyasi);

        //2- short data type:
        //Tam sayilar icindir. Hafizada 2 byte(16 bit) yer kaplar. Aralik (range) genisledi.
        //-32768 den + 32767’e tamsayi degerleri icin kullanilir

        //Ornek 1: Site nufusu icin bir variable olusturun ve 1200 degerini atayin

        short sitenufusu = 250;
        System.out.println(sitenufusu);

        //3- int data type:
        //tam sayilar icindir. Hafizada 4 byte (32 bit) yer kaplar
        //-2,147,483,648 ile 2,147,483,647’e tamsayi degerleri icin kullanilir

        //Ornek 1: Ulke nufusu icin bir variable olusturun ve deger atayin

        int countrypopulation = 30000000;
        System.out.println(countrypopulation);

        //Ornek 2: Iki tane int variable olusturun ve toplamlarini console’a yazdirin

        int karinca = 500000;
        int ari = 300000;
        System.out.println(karinca + ari);

        //4- long data type:
        //Tam sayilar icindir. Hafizada 8 byte (64 bit) yer kaplar
        //-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir

        //Not: Long olustururken eger deger, Integer’larin maximum degerinden buyuk ise
        //sonuna “L” koymak zorundasiniz, yoksa “Integer number too large - Tam sayı çok büyük hatasi alirsiniz

        //Ornek 1: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz

        long insanvucudundakihucresayisi = 30000000000000L;
        System.out.println(insanvucudundakihucresayisi);

        //Ornek 2: Iki tane Long variable olusturun ve toplamlarini bir etiketle console’a yazdirin

        long kopekhucresayisi = 4500000000L;
        long kedihucresayisi = 2500000000L;
        System.out.println(kopekhucresayisi + kedihucresayisi);

        long c = 15, d = 20;
        System.out.println("Sum : " + (c + d)); //Sum : 35

        //Java otomatik int kabul etti. Java memory korudu
    }
}
