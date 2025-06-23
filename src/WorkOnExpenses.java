import java.util.Scanner;

public class WorkOnExpenses {
    public static void intro() {
        boolean done = false;
        while(!done) {
            System.out.println("Do you want to:\n1.Filter expenses\n2.Sum all expenses\n3.Exit");
            Scanner in = new Scanner(System.in);
            ExpenseList expenseList = new ExpenseList();
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    Filter.filter();
                    break;
                case 2:
                    double sum = 0;
                    for (int i=0; i< expenseList.listSize()-1; i++){
                        sum += expenseList.getExpense(i).getAmount();
                        System.out.println("Sum: " + sum);
                    }
                    break;
                case 3:
                    done = true;
                    break;
            }
        }
    }
}
