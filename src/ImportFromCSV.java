import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ImportFromCSV {
    public static void importFromCSV() {
        ExpenseList expenseList = new ExpenseList();
        System.out.println("Enter the name of the file containing the expenses to be imported: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            boolean firstLine = true;
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] parts = line.split(", ");
                if(parts.length==4){
                    double amount = Double.parseDouble(parts[0]);
                    String category = parts[1];
                        String[] dateParts = parts[2].split("/");
                            int year = Integer.parseInt(dateParts[0]);
                            int month = Integer.parseInt(dateParts[1]);
                            int day = Integer.parseInt(dateParts[2]);
                    String description = parts[3];
                    expenseList.addExpense(amount,description,category,year,month,day);
                }
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
