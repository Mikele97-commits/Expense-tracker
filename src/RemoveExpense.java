import java.util.Scanner;

public class RemoveExpense {
    public static void removeExpense() {
        ExpenseList expenseList = new ExpenseList();
        System.out.println("Which expense would you like to remove?");
        Scanner in = new Scanner(System.in);
        int expense = in.nextInt();
        expense = expense - 1;
        boolean exit=false;
        while (expenseList.getExpense(expense) == null) {
            System.out.println("This expense does not exist. Give another one, or type '0' to exit.");
            expense = in.nextInt();
            if (expense ==0){
                exit = true;
                break;
            }
        }
        if (!exit) {
            expenseList.deleteExpense(expense);
            System.out.println("Expense removed.");
        }



    }
}
