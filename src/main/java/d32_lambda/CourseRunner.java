package d32_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CourseRunner {
    public static void main(String[] args) {

        //Course classtan object olusturalim

        Course courseTurkishDay = new Course("Summer",
                "Turkish Day",
                97,
                128);
        Course courseTurkishNight = new Course("Winter",
                "Turkish Night",
                98,
                154);
        Course courseEnglishDay = new Course("Spring",
                "English Day",
                95,
                132);
        Course courseEnglishNight = new Course("Winter",
                "English Night",
                93,
                144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(coursesList);

        //[Course{season='Summer', courseName='Turkish Day', averageScore=97, numberOfStudents=128},
        // Course{season='Winter', courseName='Turkish Night', averageScore=98, numberOfStudents=154},
        // Course{season='Spring', courseName='English Day', averageScore=95, numberOfStudents=132},
        // Course{season='Winter', courseName='English Night', averageScore=93, numberOfStudents=144}]

        //-------------------------------

        // 7) Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.

        // a) sorted, Stream içerisindeki elemanları doğal sıralamasına göre sıralar.(kucukten buyuge)
        // Özel bir sıralama için bir Comparator'da alabilir.
        // b) Comparator.comparing, belirli bir özelliğe göre elemanları sıralamak için bir Comparator oluşturur.
        // c) reversed, Bir Comparator'ın sıralama sırasını tersine çevirir.
        // d) findFirst, Stream'deki ilk elemanı döndüren bir Optional döner.

        /* String name1 = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get().
                getCourseName(); */

        String name1 = coursesList.
                stream().
                max(Comparator.comparing(Course::getAverageScore)).
                get().
                getCourseName();
        System.out.println(name1); //Turkish Night

        // 8) Tum course object'lerini average score'a gore kucukten buyuge diziniz
        // ve ilk ikisi haric liste halinde console'a yazdiriniz.

        // a) skip, Belirtilen sayıda elemanı Stream’den atlar. Burda ilk 2'sini atladik
        // b) collect(Collectors.toList()), Stream içerisindeki elemanları bir listeye dönüştürür.

        List<Course> list = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                toList(); // // toList(), collect(Collectors.toList()) kisa halidir
        System.out.println(list);
        // [Course{season='Summer', courseName='Turkish Day', averageScore=97, numberOfStudents=128},
        // Course{season='Winter', courseName='Turkish Night', averageScore=98, numberOfStudents=154}]

        System.out.println("--------------------------------------------------------------------------");

        // 9) Tum course object'lerini average score'a gore kucukten buyuge diziniz ve
        // ilk ucunu liste halinde console'a yazdiriniz.

        // a) limit, Stream’den belirli sayıda eleman alır. Burda ilk 3'unu aldik

        List<Course> list1 = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                limit(3).
                toList();
        System.out.println(list1);
        // [Course{season='Winter', courseName='English Night', averageScore=93, numberOfStudents=144},
        // Course{season='Spring', courseName='English Day', averageScore=95, numberOfStudents=132},
        // Course{season='Summer', courseName='Turkish Day', averageScore=97, numberOfStudents=128}]

        // 10) Kursta bulunan ogrenci sayilarina gore, buyukten kucuge sirali bir sekilde
        // listin icinde veren kodu yaziniz.

        List<Course> list2 = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
                toList();
        System.out.println(list2);
        // [Course{season='Winter', courseName='Turkish Night', averageScore=98, numberOfStudents=154},
        // Course{season='Winter', courseName='English Night', averageScore=93, numberOfStudents=144},
        // Course{season='Spring', courseName='English Day', averageScore=95, numberOfStudents=132},
        // Course{season='Summer', courseName='Turkish Day', averageScore=97, numberOfStudents=128}]

        // Ödev : Sadece öğrenci sayılarını görmek isteseydik ?

        List<Integer> list3 = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
                map(Course::getNumberOfStudents).
                toList();
        System.out.println(list3); // [154, 144, 132, 128]

        // 11) Kursta bulunan Ingilizce bolumlerinin sayisini veren kodu yaziniz.

        long english = coursesList.
                stream().
                filter(t -> t.getCourseName().contains("English")).
                count();
        System.out.println(english); // 2

        // 12) Ogrenci sayisi 140’tan az olan kurslari bir liste halinde veren kodu yaziniz.

        List<Course> list4 = coursesList.
                stream().
                filter(t -> t.getNumberOfStudents() < 140).
                toList();
        System.out.println(list4);
        // [Course{season='Summer', courseName='Turkish Day', averageScore=97, numberOfStudents=128},
        // Course{season='Spring', courseName='English Day', averageScore=95, numberOfStudents=132}]
    }
}
