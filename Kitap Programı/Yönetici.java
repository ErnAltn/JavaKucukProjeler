public class Yönetici extends Calisan {

    private final int AsgariUcret;

    public Yönetici(String Ad, String Soyad, Sex Cinsiyet, int SaatlikUcret, int MesaiSaati, int AsgariUcret) {
        super(Ad, Soyad, Cinsiyet, SaatlikUcret, MesaiSaati);
        this.AsgariUcret = AsgariUcret;
    }

    @Override
    public void salary() {
        super.salary();
        this.Salary += AsgariUcret;
    }

    @Override
    public String toString() {
        return super.toString() + "|| Tip: Yönetici"; 
    }

    
}