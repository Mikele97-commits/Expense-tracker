import java.util.Scanner;

public class AddExpense {
    public static void add() {
        Scanner input = new Scanner(System.in);
        String answer = "N";
        System.out.println("What is the amount of your expense?");
        double amount = input.nextDouble();
        System.out.println("What is the category of your expense?\nPossible options: Groceries, Monthly, Entertainment, Investment");
        String category = input.next();
        while (!(category.equals("Groceries")) && !(category.equals("Monthly")) && !(category.equals("Investment")) && !(category.equals("Entertainment"))) {
            System.out.println("Please enter a valid category");
            category = input.next();
        }
        System.out.println("Enter the year");
        int year = input.nextInt();
        System.out.println("Enter the month");
        int month = input.nextInt();
        while ((month < 1 || month > 12)) {
            System.out.println("Please enter a valid month");
            month = input.nextInt();
        }
        System.out.println("Enter the day");
        int day = input.nextInt();
        while ((day < 1 || day > 31)) {
            System.out.println("Please enter a valid day");
            day = input.nextInt();
        }
        System.out.println("Enter description");
        String description = input.next();
        ExpenseList list = new ExpenseList();
        list.addExpense(amount, description, category, year, month, day);
        System.out.println("You have successfully added your expense. Do you want to add another? Y/N");
        answer = input.next();
        while (!(answer.equals("Y"))&& !(answer.equals("N"))) {
            System.out.println("Please enter a valid answer");
            answer = input.next();
        }

        if (answer.equals("Y"))
            AddExpense.add();
        if (answer.equals("N"))
            Intro.intro();
    }
}
