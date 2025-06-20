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
        }
    }

    public static void show(){
        ExpenseList expenseList = new ExpenseList();
        for (int i = 0; i < expenseList.noOfExpenses(); i++){
            System.out.println("Wydatek nr "+(i+1)+":");
            expenseList.displayExpenses(i);
        }
    }
}
