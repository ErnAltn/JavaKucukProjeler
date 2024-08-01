public class Yazilimci extends Calisan
{
    private String diller;
    // Calisan classını extends ettiğimiz için üst sınıfın const çağırmamız gerekir yoksa hatayla karşılaşırız.
    public Yazilimci(String ad, String soyad, int id , String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    public void formatAt(String isletim_sistemi)
    {
        System.out.println(getAd() + " " + isletim_sistemi + "ni yüklüyor..");
    }

    @Override
    public void bilgileriGoster() {
        //Üst classın bilgileri göster metodunu çağırmak için super anahtar kelimesini kullandık.
        super.bilgileriGoster();
        System.out.println("Yazılımcının Bildiği Diller : " + diller);

    }
}
