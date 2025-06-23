import java.util.Scanner;

public class Intro {
    public static void intro() {
        int choice=0;
        while (choice!=8) {
            ExpenseList list = new ExpenseList();
            System.out.println("Welcome to your personal expense tracker.\n1.Add expense\n2.View list of expenses\n3.Edit expense\n4.Remove expense\n5.Export to CSV\n6.Import from CSV\n7.Filter/sum expenses\n8.Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AddExpense.add();
                    break;
                case 2:
                    ShowExpenses.intro();
                    break;
                case 3:
                    EditExpense.edit();
                    break;
                case 4:
                    RemoveExpense.removeExpense();
                    break;
                case 5:
                    ExportToCSV.exportToCSV(list);
                    break;
                case 6:
                    ImportFromCSV.importFromCSV();
                    break;
                case 7:
                    WorkOnExpenses.intro();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}
