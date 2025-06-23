import java.util.Scanner;

public class ShowExpenses {
    public static void intro() {
        System.out.println("Do you want to:\n1.See all expenses\n2.See specific expense\n3.Sort expenses");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1:
            ShowExpenses.show();
            Intro.intro();
            break;
            case 2:
                System.out.println("Which expense do you want to see");
                int expense = in.nextInt();
                showOne(expense);
            case 3:
                System.out.println("How do you want to sort expenses?\n1.By amount\n2.By category\n3.By date");
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        Sort.amount();
                        System.out.println("Expenses has been sorted by amount");
                        Intro.intro();
                        break;
                    case 2:
                        Sort.category();
                        System.out.println("Expenses has been sorted by category");
                        Intro.intro();
                        break;
                    case 3:
                        Sort.date();
                        System.out.println("Expenses has been sorted by date");
                        Intro.intro();
                        break;
                }
                break;



        }
    }

    public static void show(){
        ExpenseList expenseList = new ExpenseList();
        for (int i = 0; i < expenseList.listSize(); i++){
            System.out.println("Expense no "+(i+1)+":");
            expenseList.displayExpenses(i);
        }
    }

    public static void showOne(int i){
        ExpenseList expenseList = new ExpenseList();
        System.out.println("Expense no "+(i+1)+":");
        expenseList.displayExpenses(i);
    }
}
