import java.util.Scanner;

public class EditExpense {
    public static void edit() {
        Scanner input = new Scanner(System.in);
        ExpenseList expenseList = new ExpenseList();
        System.out.println("Enter number of expense to be edited: ");
        int expense = input.nextInt()-1;
        boolean exit=false;
        do {

            System.out.println("Type 'Show' to see expense\nType 'Exit' to get back to menu\nWhat would you like to edit: ");
            String dataName = input.next();
            switch (dataName) {
                case "Show":
                    ShowExpenses.showOne(expense);
                    break;
                case "Amount":
                    System.out.println("Enter new amount ");
                    double amount = input.nextDouble();
                    expenseList.setAmount(expense, amount);
                    break;
                case "Category":
                    System.out.println("Enter new category");
                    String category = input.next();
                    expenseList.setCategory(expense, category);
                    break;
                case "Date":
                    System.out.println("Enter new day");
                    int day = input.nextInt();
                    while ((day < 1 || day > 31)) {
                        System.out.println("Please enter a valid day");
                        day = input.nextInt();
                    }
                    expenseList.setDay(expense, day);
                    System.out.println("Enter new month");
                    int month = input.nextInt();
                    while ((month < 1 || month > 12)) {
                        System.out.println("Please enter a valid month");
                        month = input.nextInt();
                    }
                    expenseList.setMonth(expense, month);
                    System.out.println("Enter new year");
                    int year = input.nextInt();
                    expenseList.setYear(expense, year);
                    break;
                case "Description":
                    System.out.println("Enter new description");
                    String description = input.next();
                    expenseList.setDescription(expense, description);
                    break;
                case "Exit":
                    exit=true;
                    break;
            }
        }while(!exit);
    }
}
