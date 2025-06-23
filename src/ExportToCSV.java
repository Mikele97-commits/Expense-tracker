import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ExportToCSV {
    public static void exportToCSV(ExpenseList list) {
        System.out.println("How do you want to name your file?");
        Scanner scanner=new Scanner(System.in);
        String fileName=scanner.next()+".csv";
        File file = new File(fileName);
        while (file.exists()){
            System.out.println("File of such name already exists, input new name");
            fileName=scanner.nextLine();
            file = new File(fileName+".csv");
        }
        try (FileWriter writer = new FileWriter(fileName+".csv")) {

            writer.write("Name,Amount,Date\n");
            for (int i=0; i<list.listSize(); i++) {
                writer.write( list.getAmount(i) + ", "   + list.getCategory(i) + ", " + list.getDate(i) + ", " + list.getDescription(i) +"\n");
            }

            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
