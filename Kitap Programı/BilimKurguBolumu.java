import java.util.ArrayList;

public class BilimKurguBolumu extends Bolum {

    public BilimKurguBolumu(int BookCount, Personel staff, ArrayList<Kitap> booklist) {
        super(BookCount, staff, booklist);
    }

    @Override
    public void Display() {
        System.out.println("##Bilim Kurgu Bölümü##");
        super.Display(); 
    }

 
  

    
    
    
}