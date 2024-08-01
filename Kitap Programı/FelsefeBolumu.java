import java.util.ArrayList;

public class FelsefeBolumu extends Bolum{

    public FelsefeBolumu(int BookCount, Personel staff, ArrayList<Kitap> booklist) {
        super(BookCount, staff, booklist);
    }

    @Override
    public void Display() {
        System.out.println("##Felsefe Bölümü##");
        super.Display(); 
    }
    
}