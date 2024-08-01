import java.util.ArrayList;
public class FantastikBolumu extends Bolum {

    public FantastikBolumu( int BookCount, Personel staff, ArrayList<Kitap> booklist) {
        super(BookCount, staff, booklist);
    }

   @Override
    public void Display() {
        System.out.println("##Fantastik Bölümü##");
        super.Display(); 
    }
 
    
    
    
}