public class Expense {
    double amount;
    String description;
    String category;
    int year;
    int month;
    int day;

    public Expense(double amount, String description, String category, int year, int month, int day) {
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getDate(){
        return getYear()+"/"+getMonth()+"/"+getDay();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
