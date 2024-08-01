import java.util.ArrayList;

public abstract class Bolum {
    protected final int BookCount;
    protected Personel staff;

    protected ArrayList<Kitap> booklist = new ArrayList();

    public Bolum(int BookCount, Personel staff,  ArrayList<Kitap> booklist) {
        this.BookCount = BookCount;
        this.staff = staff;
        
        booklist.forEach((book) -> { 
            this.booklist.add(book);
        });
        
    }

    public ArrayList<Kitap> getBooklist() {
        return booklist;
    }

    public Personel getStaff() {
        return staff;
    }

    public void setStaff(Personel staff) {
        this.staff = staff;
    }

    public int getBookCount() {
        return BookCount;
    }
    public void AddBook(Kitap book) {
        this.booklist.add(book);
    }

    
    public void Display() {
        System.out.printf("Kitap Sayısı: %5d Personel: %s \n",BookCount,staff.getName());
        booklist.forEach((Kitap book) -> {
            System.out.printf("\t Kitap Adı: %15s || Kitap Fiyatı: %5d $\n7",book.getName(),book.getPrice());
        });
         
    }
    
   
}