public class Personel extends Calisan {

    public Personel(String Ad, String Soyad, Sex Cinsiyet, int SaatlikUcret, int MesaiSaati) {
        super(Ad, Soyad, Cinsiyet, SaatlikUcret, MesaiSaati);
    }
    
     @Override
    public String toString() {
        return super.toString() + "|| Tip:     Personel"; 
    }
}