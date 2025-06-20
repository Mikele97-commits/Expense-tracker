import java.util.Scanner;

public class Intro {
    public static void intro() { System.out.println("Welcome to your personal expense tracker.\n1.Add expense\n2.View expenses\n3.Edit expense\n4.Remove expense\n5.Export to CSV\n6.Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                AddExpense.add();
                break;
            case 2:
                ShowExpenses.intro();
                break;

        }
    }
}
