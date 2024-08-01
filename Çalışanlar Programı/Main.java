import java.util.Scanner;

public class Main
{
    /*
    Calisanlar Programı

    -Calısan sınıfı şeklinde bir üst sınıf
    -Calışan sınıfından türeyen yazılımcı adında bir alt sınıf
    -Calısan sınıfından tureyen yonetıcı adında bir alt sınıf
     */
    /**
     * @param args
     */
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz..");
        String islemler = "İşlemler... \n"
                + "1. Yazılımcı işleri\n"
                + "2. Yönetici İşlemleri\n"
                + "Çıkış için q'ya basın";
        System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");

        while (true)
        {
            System.out.println("İşlemi Seçiniz : ");
            String islem = input.nextLine();
            if (islem.equals("q"))
            {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                Yazilimci yazilimci = new Yazilimci("Eren ", "ALTAN", 101,"Python,Java,C#");
                //Yazılımcı işlemlerinin devam etmesini istediğimiz için bir tane daha while döngüsü açtık.
                String yazilimci_islem ="1. Format At\n"
                                        +"2. Bilgileri Göster\n"
                                        +"Çıkış için q'ya basın";
                System.out.println(yazilimci_islem);
                while (true)
                {
                    System.out.println("İşlemi Seçiniz : ");
                    String y_islem = input.nextLine();

                    if (y_islem.equals("q"))
                    {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1"))
                    {
                        System.out.println("İşletim Sistemi : ");
                        String isletim_sistemi = input.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2"))
                    {
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlem..");
                    }
                }
            }
            else if (islem.equals("2"))
            {
                Yonetici yonetici = new Yonetici("Karahan ","Güllü",12345,30);
                String yonetici_islem = "Yönetici İşlemleri\n"
                                            +"1. Zam Yap\n"
                                            +"2. Bilgileri Göster\n"
                                            +"Çıkıi için q'ya basın";
                System.out.println(yonetici_islem);

                while (true)
                {
                    System.out.println("İşlem Seçiniz: " );
                    String y_islem = input.nextLine();

                    if (y_islem.equals("q"))
                    {
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1"))
                    {
                        System.out.println(" Yöneticinin ne kadar zam yapmasını istiyorsunuz :  ");
                        int zamMiktari = input.nextInt();
                        input.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if (y_islem.equals("2"))
                    {
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yönetici İşlem..");
                    }
                }
            }
            else
            {
                System.out.println("Geçersiz İşlem...");
            }
        }

    }


}