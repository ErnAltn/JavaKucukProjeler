public class KitapciTest {

    public static void main(String[] args) {
        Kitapci DR = new Kitapci("D&R");

        boolean flag = true;
        while (flag) {
            System.out.println("1 Tedarikten Satın Almak İçin");
            System.out.println("2 Müşteriye Satmak İçin");
            System.out.println("3 Bir Çalışan İşe Almak İçin");
            System.out.println("4 Bir Çalışanı Kovmak İçin ");
            System.out.println("5 Kitap Listesini Görmek İçin");
            System.out.println("6 Çalışan Listesini Görmek İçin");
            System.out.println("7 Bölümleri Görmek İçin");
            System.out.println("8 Çıkmak İçin");
            int choice = DR.GetInteger(8);
            switch (choice) {
                case 1:
                    DR.Buy();
                    break;
                case 2:
                    DR.Sell();
                    break;
                case 3:
                    DR.Hire();
                    break;
                case 4:
                    DR.Firing();
                    break;
                case 5:
                    DR.Booklist();
                    break;
                case 6:
                    DR.EmployeeList();
                    break;
                case 7:
                    DR.ShowSections();
                    break;
                     case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("Hata");
                    break;
            }

        }
    }

}