package d24_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        // Interview Sorusu
        // Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.

        /* TreeSet<String> studentMails = new TreeSet<>();
        studentMails.add("alican123@gmail.com");
        studentMails.add("mervenur123@gmail.com");
        studentMails.add("sümeyyecnn1@gmail.com");
        studentMails.add("hüseyin32@gmail.com");
        studentMails.add("mahidevran23@gmail.com");
        System.out.println(studentMails); [alican123@gmail.com, hüseyin32@gmail.com, mahidevran23@gmail.com,
        mervenur123@gmail.com, sümeyyecnn1@gmail.com] */

        // Mailler unique, set kullanalım. Natural sıralama yapan set hangisiydi ? TreeSet

        long t1 = System.nanoTime();

        // 1.Yol : Yavaş - Her elemanda sıralama yapar

        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails); // [a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com,
        // t@gmail.com, u@gmail.com, x@gmail.com, z@gmail.com]

        long t2 = System.nanoTime();

        // TreeSet'ler çok yavaş, biraz hızlandıralım
        // Elemanları eklerken en hızlı olandan yardım alalım(HashSet)

        // 2.Yol : Tavsiye edilir, daha hızlı

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("x@gmail.com");
        System.out.println(emailsHs); // [b@gmail.com, k@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com, p@gmail.com,
        // z@gmail.com, u@gmail.com, a@gmail.com, l@gmail.com]

        // Boş bir TreeSet oluşturalım ve constructor'ına HashSet'i yazalım

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs); // [a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com,
        // t@gmail.com, u@gmail.com, x@gmail.com, z@gmail.com]

        long t3 = System.nanoTime();
        System.out.println(t2 - t1); // 453600 1.Yol - TreeSet'li - yavaş
        System.out.println(t3 - t2); // 123400 2.Yol - HashSet'li - hızlı
    }
}
