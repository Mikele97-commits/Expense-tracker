import java.util.Scanner;

public class ShowExpenses {
    public static void intro() {
        System.out.println("Do you want to:\n1.See expenses\n2.Sort expenses");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1:
            ShowExpenses.show();
            Intro.intro();
            break;
            case 2:
                System.out.println("How do you want to sort expenses?\n1.By amount\n2.By category\n3.By date");
                choice = in.nextInt();
                switch (choice) {
                    case 2:
                        Sort.category();
                        System.out.println("Expenses has been sorted by category");
                        Intro.intro();
                        break;
                }
        }
    }

    public static void show(){
        ExpenseList expenseList = new ExpenseList();
        for (int i = 0; i < expenseList.listSize(); i++){
            System.out.println("Wydatek nr "+(i+1)+":");
            expenseList.displayExpenses(i);
        }
    }
}
