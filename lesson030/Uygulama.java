package com.bilgeadam.lesson030;

import java.sql.SQLSyntaxErrorException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Uygulama {
List<Film>  filmler;
Scanner scanner=new Scanner(System.in);

    public void baslangicVerisiOlustur() {
        Yonetmen yonetmen1 = new Yonetmen("Miyazaki", "Japonya");
        Film film1 = new Film("Ruhlar�n Ka����", LocalDate.of(2001, 10, 10), 5000000, ETur.ANIME, yonetmen1, 9.5);
        Film film2 = new Film("R�zgarl� Vadi", LocalDate.of(1984, 06, 8), 1000000, ETur.ANIME, yonetmen1, 9.1);
        Film film3 = new Film("Prenses Mononoke", LocalDate.of(1997, 10, 10), 30000000, ETur.ANIME, yonetmen1, 9.6);
        Film film4 = new Film("Y�r�yen �ato", LocalDate.of(2004, 10, 10), 1000000, ETur.ANIME, yonetmen1, 8.7);

        Yonetmen yonetmen2 = new Yonetmen("Reha Erdem", "T�rkiye");
        Film film5 = new Film("Ka� Para Ka�", LocalDate.of(1999, 10, 10), 100000, ETur.DRAMA, yonetmen2, 7.5);
        Film film6 = new Film("Korkuyorum Anne", LocalDate.of(2004, 06, 8), 300000, ETur.KARAMIZAH, yonetmen2, 8.1);
        Film film7 = new Film("Kosmos", LocalDate.of(2009, 12, 12), 500000, ETur.DRAMA, yonetmen2, 8.6);
        Film film8 = new Film("Seni Buldum Ya", LocalDate.of(2021, 12, 12), 400000, ETur.KARAMIZAH, yonetmen2, 7.2);

        Yonetmen yonetmen3 = new Yonetmen("David Fincher", "Amerika");
        Film film9 = new Film("Seven", LocalDate.of(1995, 10, 10), 2500000, ETur.DRAMA, yonetmen3, 8.8);
        Film film10 = new Film("D�v�� Kul�b�", LocalDate.of(1999, 06, 8), 2500000, ETur.AKSIYON, yonetmen3, 9.4);
        Film film11 = new Film("Zodiac", LocalDate.of(2007, 11, 20), 800000, ETur.GERILIM, yonetmen3, 7.8);
        Film film12 = new Film("Gone Girl", LocalDate.of(2014, 10, 10), 1500000, ETur.DRAMA, yonetmen3, 8.2);
        Film film13 = new Film("Mank", LocalDate.of(2020, 12, 12), 2000000, ETur.DRAMA, yonetmen3, 8.4);

        Yonetmen yonetmen4 = new Yonetmen("Cohens", "Amerika");
        Film film14 = new Film("Barton Fink", LocalDate.of(1991, 12, 12), 500000, ETur.GERILIM, yonetmen4, 8.5);
        Film film15 = new Film("Fargo", LocalDate.of(1996, 12, 12), 800000, ETur.GERILIM, yonetmen4, 8.1);
        Film film16 = new Film("Big Lebowski", LocalDate.of(1998, 12, 12), 1100000, ETur.KARAMIZAH, yonetmen4, 9.2);
        Film film17 = new Film("Nerdesin Be Birader", LocalDate.of(2000, 02, 2), 1500000, ETur.KARAMIZAH, yonetmen4, 7.8);
        Film film18 = new Film("Orada Olmayan Adam", LocalDate.of(2001, 7, 17), 500000, ETur.GERILIM, yonetmen4, 8.3);
        Film film19 = new Film("�htiyarlara Yer Yok", LocalDate.of(2007, 7, 17), 1700000, ETur.DRAMA, yonetmen4, 9.3);
        Film film20 = new Film("Ciddi Bir Adam", LocalDate.of(2009, 7, 17), 500000, ETur.KARAMIZAH, yonetmen4, 8.0);

        Yonetmen yonetmen5 = new Yonetmen("Emin Alper", "T�rkiye");
        Film film21 = new Film("Tepenin Ard�", LocalDate.of(2012, 7, 17), 50000, ETur.DRAMA, yonetmen5, 7.7);
        Film film22 = new Film("K�z Karde�ler", LocalDate.of(2019, 7, 17), 400000, ETur.DRAMA, yonetmen5, 8.5);
        Film film23 = new Film("Kurak G�nler", LocalDate.of(2022, 7, 17), 600000, ETur.DRAMA, yonetmen5, 8.4);

        Yonetmen yonetmen6 = new Yonetmen("Wes Anderson", "Amerika");
        Film film24 = new Film("Yaman Tilki", LocalDate.of(2009, 7, 17), 900000, ETur.ANIMASYON, yonetmen6, 7.8);
        Film film25 = new Film("Moonrise Kingdom", LocalDate.of(2012, 7, 17), 8500000, ETur.FANTASTIK, yonetmen6, 8.6);
        Film film26 = new Film("B�y�k Budape�te Oteli", LocalDate.of(2014, 7, 17), 1200000, ETur.FANTASTIK, yonetmen6, 9.0);
        Film film27 = new Film("K�pek Adas�", LocalDate.of(2018, 7, 17), 1500000, ETur.ANIMASYON, yonetmen6, 9.2);

        filmler = new ArrayList<>(List.of(
                film1, film2, film3, film4, film5, film6, film7, film8, film9, film10,
                film11, film12, film13, film14, film15, film16, film17, film18, film19, film20,
                film21, film22, film23, film24, film25, film26, film27
        ));
    }

    /*
        puanlar� 8 den b�y�k olan filmleri bir sette toplayal�m ve puan� 8 den b�y�k olanlar�n y�netmenlerini bir sette toplayal�m.
     */

    public void yuksekPuanlilar(){
        Set<Film>filmlerSet=filmler.stream().filter(x->x.getPuan()>8).collect(Collectors.toSet());
        filmlerSet.forEach(System.out::println);
        System.out.println("*****************************************************************");
        Set<String> yuksekPuanliYonetmenler=filmler.stream().filter(f->f.getPuan()>8).map(f->f.getYonetmen().getIsim()).collect(Collectors.toSet());
        yuksekPuanliYonetmenler.forEach(System.out::println);
    }

    /*
        D��ar�dan bir �lke ismi alal�m bir metod yazal�m ve metot o �lkeli olan y�netmenleri bir listede toplayal�m.
     */

    public void ulkeyeGoreYonetmenler(){
        System.out.println("�lke ismi giriniz...:");
        String ulke=scanner.nextLine();
        List<String>yonetmenler=filmler.stream().filter(f->f.getYonetmen().getUlke().equalsIgnoreCase(ulke)).map(f->f.getYonetmen().getIsim()).distinct().collect(Collectors.toList());
        yonetmenler.forEach(System.out::println);

    }
    public void ulkesineGoreYonetmenler(){
        TreeMap<String,List<Yonetmen>> yonetmenler=filmler.stream().map(Film::getYonetmen).
                collect(Collectors.groupingBy(Yonetmen::getUlke,TreeMap::new,Collectors.toList()));
        yonetmenler.forEach((k,v)-> System.out.println(k+" - "+v));

    }

    /*
        has�lat� en y�ksek filmi bulal�m.
     */

    public void hasilatiEnYuksekFilm(){
        Optional<Film> film = filmler.stream().max(Comparator.comparingLong(f -> f.getHasilat()));
        System.out.println("En y�ksek has�lata sahip film...:"+film);
    }

    /*
        Film t�rlerine g�re filmleri tutal�m.
     */

    public void turuneGoreFilmler(){
        Map<ETur,List<Film>>tureGoreFilm=filmler.stream().collect(Collectors.groupingBy(x->x.getTur()));
        tureGoreFilm.entrySet().forEach(System.out::println);
    }

    /*
        Her t�rkdeki en y�ksek has�latl� filmi e�le�tirelim.
     */

    public void turuneGoreHasilatiEnYuksekFilm(){
        Map<ETur, Optional<Film>> tureGoreFilm=filmler.stream().collect(Collectors.
                groupingBy(x->x.getTur(),Collectors.maxBy(Comparator.comparingLong(Film::getHasilat))));
        System.out.println("Tür�ne g�re en y�ksek has�latl� film...:");
        tureGoreFilm.entrySet().forEach(System.out::println);
    }

    public void puanaGoreSirala(){
        filmler.stream().sorted(Comparator.comparing(f-> f.getPuan())).skip(5).forEach(System.out::println);
    }
    public void turuneGoreOrtPuan(ETur tur){
        Double collect = filmler.stream().filter(f -> f.getTur().equals(tur)).collect(Collectors.averagingDouble(f->f.getPuan()));
        System.out.println(collect);

    }
    public void filmleriBelirliAraliktakiHasilataGore(long baslangic,long bitis){
        filmler.stream().filter(f->(f.getHasilat()<bitis &&f.getHasilat()>baslangic)).forEach(System.out::println);
    }

    public void animelerinToplamHasilati(){
        long x = filmler.stream().filter(f -> f.getTur().equals(ETur.ANIME)).mapToLong(f -> f.getHasilat()).sum();
        System.out.println(x);
    }

    public int yonetmeninFilmSayisi(String yonetmen){
        int x= (int) filmler.stream().filter(f->f.getYonetmen().getIsim().equals(yonetmen)).distinct().count();
        return x;
    }



    public static void main(String[] args) {
        Uygulama uygulama=new Uygulama();
        uygulama.baslangicVerisiOlustur();
//        uygulama.yuksekPuanlilar();
//        uygulama.ulkeyeGoreYonetmenler();
//        uygulama.hasilatiEnYuksekFilm();
//        uygulama.turuneGoreFilmler();
//        uygulama.turuneGoreHasilatiEnYuksekFilm();
//        uygulama.puanaGoreSirala();
//        uygulama.turuneGoreOrtPuan(ETur.ANIME);
//        uygulama.filmleriBelirliAraliktakiHasilataGore(500000,999999);
//        uygulama.animelerinToplamHasilati();
//        System.out.println(uygulama.yonetmeninFilmSayisi("Miyazaki"));

        /**
         * Son 3 tanesini yapamad�m.
         */

    }
}
