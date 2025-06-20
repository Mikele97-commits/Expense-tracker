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
}
