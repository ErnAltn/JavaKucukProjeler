public abstract class Calisan {

    protected final String Name;
    protected final String Surname;

    public enum Sex {
        FEMALE,
        MALE
    }
    protected final Sex sex;
    protected final int HourlySalary;
    protected final int Hours;
    protected int Salary;

    public Calisan(String Name, String Surname, Sex sex, int HourlySalary, int Hours) {
        this.Name = Name;
        this.Surname = Surname;
        this.sex = sex;
        this.HourlySalary = HourlySalary;
        this.Hours = Hours;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public Sex getSex() {
        return sex;
    }

    public int getSalary() {
        return HourlySalary;
    }

    public int getHours() {
        return Hours;
    }

    @Override
    public String toString() {
        return String.format("Ad: %10s || Soyad: %10s || Cinsiyet: %10s || Ücret: %10s || Saat: %10s ", Name, Surname, sex, HourlySalary, Hours);
    }

    public void salary() {

        if (this.Hours % 40 > 0) {
            Salary += (HourlySalary*1.5) * (Hours % 40);
            Salary += HourlySalary*40;
        } else {
            Salary += HourlySalary * Hours;
        }
    }
}