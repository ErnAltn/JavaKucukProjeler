import java.util.ArrayList;

public class EdebiyatBolumu  extends Bolum {

    public EdebiyatBolumu(int BookCount, Personel staff, ArrayList<Kitap> booklist) {
        super(BookCount, staff, booklist);
    }

    
@Override
    public void Display() {
        System.out.println("##Edebiyat Bölümü##");
        super.Display();
    }
    
        
    
}