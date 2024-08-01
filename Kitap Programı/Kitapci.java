import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kitapci {

    private final String StoreName;
    ArrayList<Kitap> booklist = new ArrayList();
    ArrayList<Calisan> Employeelist = new ArrayList();
    Scanner sc = new Scanner(System.in);
    SecureRandom rand = new SecureRandom();
    private final BilimKurguBolumu SciFi;
    private final FantastikBolumu Fantastic;
    private final FelsefeBolumu Philosophy;
    private final EdebiyatBolumu Literature;
    Calisan Staff1 = new Personel("Eren", "ALTAN", Calisan.Sex.MALE, 9000, 40);

    /*----------------------------------------------------------------------------*/
    Calisan Staff2 = new Personel("Karahan", "Güllü", Calisan.Sex.MALE, 9000, 40);
    Calisan Staff3 = new Personel("Yunus", "SASA", Calisan.Sex.MALE, 9000, 40);
    Calisan Staff4 = new Personel("Betül", "GÜVEN", Calisan.Sex.FEMALE, 9000, 40);
    Calisan Staff5 = new Personel("Şeyda", "AYHAN", Calisan.Sex.FEMALE, 9000, 40);
    Calisan Sv = new Yönetici("Eren", "ALTAN", Calisan.Sex.MALE, 9000, 40, 5000);
    Kitap book1 = new Kitap("Harry Potter 1", 35);
    Kitap book2 = new Kitap("Harry Potter 2", 35);
    Kitap book3 = new Kitap("Harry Potter 3", 35);
    Kitap book4 = new Kitap("Harry Potter 4", 35);
    Kitap book5 = new Kitap("Harry Potter 5", 35);
    Kitap book6 = new Kitap("Harry Potter 6", 35);
    Kitap book7 = new Kitap("Harry Potter 7", 35);
    Kitap book8 = new Kitap("Fantastik", 35);
    Kitap book9 = new Kitap("Edebiyat", 35);
    Kitap book10 = new Kitap("Felsefe", 35);

    /*----------------------------------------------------------------------------*/
    public Kitapci(String StoreName) {
        this.StoreName = StoreName;
        SciFi = new BilimKurguBolumu(booklist.size(), ((Personel) Staff1), booklist);
        Fantastic = new FantastikBolumu(booklist.size(), ((Personel) Staff1), booklist);
        Philosophy = new FelsefeBolumu(booklist.size(), ((Personel) Staff1), booklist);
        Literature = new EdebiyatBolumu(booklist.size(), ((Personel) Staff1), booklist);
        SciFi.AddBook(book1);
        SciFi.AddBook(book2);
        SciFi.AddBook(book3);
        SciFi.AddBook(book4);
        SciFi.AddBook(book5);
        SciFi.AddBook(book6);
        SciFi.AddBook(book7);
        Fantastic.AddBook(book8);
        Literature.AddBook(book9);
        Philosophy.AddBook(book10);
        booklist.add(book1);
        booklist.add(book2);
        booklist.add(book3);
        booklist.add(book4);
        booklist.add(book5);
        booklist.add(book6);
        booklist.add(book7);
        booklist.add(book8);
        booklist.add(book9);
        booklist.add(book10);
        Employeelist.add(Staff2);
        Employeelist.add(Staff3);
        Employeelist.add(Staff4);
        Employeelist.add(Staff5);
        Employeelist.add(Sv);
    }

    /*----------------------------------------------------------------------------*/
    public void Buy() {
        while (true) {
            System.out.println("Lütfen Kitap İsmini Giriniz");
            String BookName = sc.next();
            System.out.println("Lütfen Sayısını Giriniz " + BookName + " Kitap");
            int BookC = GetInteger();
            Kitap book = new Kitap(BookName, ((rand.nextInt(15) + 30)));
            System.out.println("O Kitaplar Hangi Bölümde Saklanacak?");
            System.out.println("\t1 Bilim Kurgu");
            System.out.println("\t2 Fantastik");
            System.out.println("\t3 Felsefe");
            System.out.println("\t4 Edebiyat");
            int choice = GetInteger(4);
            switch (choice) {
                case 1:
                    for (int i = 0; i < BookC; i++) {
                        SciFi.AddBook(book);
                        booklist.add(book);
                    }
                    break;
                case 2:
                    for (int i = 0; i < BookC; i++) {
                        Fantastic.AddBook(book);
                        booklist.add(book);
                    }
                    break;
                case 3:
                    for (int i = 0; i < BookC; i++) {
                        Philosophy.AddBook(book);
                        booklist.add(book);
                    }
                    break;
                case 4:
                    for (int i = 0; i < BookC; i++) {
                        Literature.AddBook(book);
                        booklist.add(book);
                    }
                    break;
                default:
                    System.out.println("Hata");
                    break;
            }
            System.out.println("Daha Fazla Kitap Almak İster Misiniz? (y/n)");
            String c2 = sc.next().toLowerCase();
            if (c2.charAt(0) == 'n') {
                break;
            }
        }
    }

    /*----------------------------------------------------------------------------*/
    public void ShowSections() {
        System.out.println("Hangi Bölümü Görmek İstersiniz?");
        System.out.println("\t1 Bilim Kurgu");
        System.out.println("\t2 Fantastik");
        System.out.println("\t3 Felsefe");
        System.out.println("\t4 Edebiyat");
        int choice = GetInteger(4);
        switch (choice) {
            case 1:
                SciFi.Display();
                break;
            case 2:
                Fantastic.Display();
                break;
            case 3:
                Philosophy.Display();
                break;
            case 4:
                Literature.Display();
                break;
            default:
                System.out.println("Hata");
                break;
        }

    }

    /*----------------------------------------------------------------------------*/
    public void Booklist() {

        booklist.forEach((book) -> {

            System.out.println(book);
        });

    }

    /*----------------------------------------------------------------------------*/
    public void Sell() {
        System.out.println("Hoşgeldiniz " + this.StoreName);
        int counter = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Hangi Bölümü Görmek İstersiniz");
            System.out.println("\t1 Bilim Kurgu");
            System.out.println("\t2 Fantastik");
            System.out.println("\t3 Felsefe");
            System.out.println("\t4 Edebiyat");
            int choice = GetInteger(4);
            switch (choice) {
                case 1:
                    System.out.println("Adım " + SciFi.getStaff().getName() + "Size Nasıl Yardımcı Olabilirim?\nHangi Kitabı Almak İstiyorsunuz?");
                    String Bname = sc.next();
                    for (int i = 0; i < booklist.size(); i++) {
                        if (Bname.equals(booklist.get(i).getName())) {
                            counter++;
                        }
                        if (counter == 1) {
                            System.out.println(booklist.get(i));
                            booklist.remove(booklist.get(i));
                        }
                    }
                    if (counter == 0) {
                        System.out.println("Üzgünüm. O Kitap Bizde Yok.");
                    }
                    break;
                case 2:
                    System.out.println("Adım " + Fantastic.getStaff().getName() + "Size Nasıl Yardımcı Olabilirim?\nHangi Kitabı Almak İstiyorsunuz?");
                    String Bname1 = sc.next();
                    for (int i = 0; i < booklist.size(); i++) {
                        if (Bname1.equals(booklist.get(i).getName())) {
                            counter++;
                        }
                        if (counter == 1) {
                            System.out.println(booklist.get(i));
                            booklist.remove(booklist.get(i));
                        }
                    }
                    if (counter == 0) {
                        System.out.println("Üzgünüm. O Kitap Bizde Yok.");
                    }
                    break;
                case 3:
                    System.out.println("Adım " + Philosophy.getStaff().getName() + "Size Nasıl Yardımcı Olabilirim?\nHangi Kitabı Almak İstiyorsunuz?");
                    String Bname2 = sc.next();
                    for (int i = 0; i < booklist.size(); i++) {
                        if (Bname2.equals(booklist.get(i).getName())) {
                            counter++;
                        }
                        if (counter == 1) {
                            System.out.println(booklist.get(i));
                            booklist.remove(booklist.get(i));
                        }
                    }
                    if (counter == 0) {
                        System.out.println("Üzgünüm. O Kitap Bizde Yok.");
                    }
                    break;
                case 4:
                    System.out.println("Adım " + Literature.getStaff().getName() + "Size Nasıl Yardımcı Olabilirim?\nHangi Kitabı Almak İstiyorsunuz?");
                    String Bname3 = sc.next();
                    for (int i = 0; i < booklist.size(); i++) {
                        if (Bname3.equals(booklist.get(i).getName())) {
                            counter++;
                        }
                        if (counter == 1) {
                            System.out.println(booklist.get(i));
                            booklist.remove(booklist.get(i));
                        }
                    }
                    if (counter == 0) {
                        System.out.println("Üzgünüm. O Kitap Bizde Yok.");
                    }
                    break;
                default:
                    System.out.println("Hata");
                    break;
            }

            System.out.println("Başka Bir Kitap Almak İster Misiniz? (y/n)");
            String c2 = sc.next().toLowerCase();
            if (c2.charAt(0) == 'n') {
                flag = false;
            }
        }
    }

    /*----------------------------------------------------------------------------*/
    public void Hire() {
        int counter = 0;
        System.out.println("Yönetici Misiniz?(y/n)");
        String c2 = sc.next().toLowerCase();
        switch (c2.charAt(0)) {
            case 'n': {
                System.out.print("Lütfen Çalışan Adını Giriniz: ");
                String Hname = sc.next();
                System.out.print("Lütfen Çalışan Soyadını Giriniz: ");
                String Hsurname = sc.next();
                System.out.print("Lütfen Saatlik Ücreti Giriniz: ");
                int Hs = GetInteger();
                System.out.print("Lütfen Çalışacağı Saati Giriniz: ");
                int H = GetInteger();
                System.out.println("1 -> Erkek \n2 -> Kız");
                int S = GetInteger(2);
                boolean flag = true;
                while (flag) {
                    switch (S) {
                        case 1:
                            Calisan he = new Personel(Hname, Hsurname, Calisan.Sex.MALE, Hs, H);
                            for (int i = 0; i < Employeelist.size(); i++) {
                                if (Employeelist.get(i).getName().equals(he.getName()) && Employeelist.get(i).getSurname().equals(he.getSurname())) {
                                    counter++;
                                }

                            }
                            if (counter == 0) {
                                Employeelist.add(he);
                                System.out.println("O işe Alındı");
                            } else {
                                System.out.println("O Mevcut");
                            }

                            flag = false;
                            break;
                        case 2:
                            Calisan she = new Personel(Hname, Hsurname, Calisan.Sex.FEMALE, Hs, H);
                            for (int i = 0; i < Employeelist.size(); i++) {
                                if (Employeelist.get(i).getName().equals(she.getName()) && Employeelist.get(i).getSurname().equals(she.getSurname())) {
                                    counter++;
                                }

                            }
                            if (counter == 0) {
                                Employeelist.add(she);
                                System.out.println("O İşe Alındı");
                            } else {
                                System.out.println("O Mevcut");
                            }

                            flag = false;
                            break;
                        default:
                            System.out.println("1 veya 2 yi seçmelisiniz.");
                            break;
                    }
                }
                break;
            }
            case 'y': {
                System.out.print("Lütfen Çalışan Adını Giriniz: ");
                String Hname = sc.next();
                System.out.print("Lütfen Çalışan Soyadını Giriniz: ");
                String Hsurname = sc.next();
                System.out.print("Lütfen Saatlik Ücreti Giriniz: ");
                int Hs = GetInteger();
                System.out.print("Lütfen Çalışacağı Saati Giriniz: ");
                int H = GetInteger();
                System.out.print("Lütfen Taban Maaşı Giriniz: ");
                int B = GetInteger();
                System.out.println("1 -> Erkek \n2 -> Kız");
                int S = GetInteger(2);
                boolean flag = true;

                while (flag) {
                    switch (S) {
                        case 1:
                            Calisan he = new Yönetici(Hname, Hsurname, Calisan.Sex.MALE, Hs, H, B);
                            for (int i = 0; i < Employeelist.size(); i++) {
                                if (Employeelist.get(i).getName().equals(he.getName()) && Employeelist.get(i).getSurname().equals(he.getSurname())) {
                                    counter++;
                                }

                            }
                            if (counter == 0) {
                                Employeelist.add(he);
                                System.out.println("O İşe Alındı");
                            } else {
                                System.out.println("O Mevcut");
                            }
                            flag = false;
                            break;

                        case 2:
                            Calisan she = new Yönetici(Hname, Hsurname, Calisan.Sex.FEMALE, Hs, H, B);
                            for (int i = 0; i < Employeelist.size(); i++) {
                                if (Employeelist.get(i).getName().equals(she.getName()) && Employeelist.get(i).getSurname().equals(she.getSurname())) {
                                    counter++;
                                }

                            }
                            if (counter == 0) {
                                Employeelist.add(she);
                                System.out.println("O İşe Alındı");
                            } else {
                                System.out.println("O Mevcut");
                            }
                            flag = false;
                            break;
                        default:
                            System.out.println("1 veya 2 yi seçmelisiniz.");
                            break;
                    }
                }
                break;
            }
            default:
                System.out.println("Hata!");
                break;
        }

    }

    /*----------------------------------------------------------------------------*/
    public void Firing() {
        System.out.println("Güncel Çalışan Listesi");
        EmployeeList();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Lütfen İşten Çıkarmak İstediğiniz Çalışan Adını Giriniz.");
        String FName = sc.next();
        Calisan fired1 = new Personel(FName, "Yoy", Calisan.Sex.FEMALE, 0, 0);

        for (int i = 0; i < Employeelist.size(); i++) {
            if (Employeelist.get(i).getName().equals(fired1.getName())) {
                System.out.println("İşten Çıkarıldı.");
                Employeelist.remove(Employeelist.get(i));
            }
        }

    }

    /*----------------------------------------------------------------------------*/
    public void EmployeeList() {
        Employeelist.forEach((employee) -> {

            System.out.println(employee);
        });
    }

    /*-------------------------INPUT LOOP WITH TRY CATCH--------------------------*/
    public int GetInteger(int Num) {
        int input = -199;
        do {
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Lütfen bu aralıkta bir sayı giriniz: 1 ve  " + Num);
                sc.next();
            }
        } while (input == -199);
        return input;
    }

    public int GetInteger() {
        int input = -1999;
        do {
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {

                sc.next();
            }
        } while (input < 0);
        return input;
    }
    /*----------------------------------------------------------------------------*/
}