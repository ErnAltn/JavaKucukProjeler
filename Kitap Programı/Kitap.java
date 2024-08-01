public class Kitap {
    private String Name;
    private int Price;

    public Kitap(String Name, int Price) {
        this.Name = Name;
        this.Price = Price;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return String.format("Kitap İsmi: %15s || Kitap Fiyatı: %3d$",Name,Price);
    }
    
    
}