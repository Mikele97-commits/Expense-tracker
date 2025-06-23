import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;

public class Filter {
    public static void filter() {
        ExpenseList list = new ExpenseList();
        System.out.println("Do you want to filter by:\n1.Amount range\n2.Category\n3.Date range");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        double sum = 0;
        switch(choice) {
            case 1:
                System.out.println("Enter amount range (min)");
                double amountMin = in.nextDouble();
                System.out.println("Enter amount range (max)");
                double amountMax = in.nextDouble();
                sum=0;
                for (int i=0; i<list.listSize()-1; i++){
                    if (list.getAmount(i)>amountMin && list.getAmount(i)<amountMax){
                        sum+=list.getAmount(i);
                        list.displayExpenses(i);
                    }
                }
                System.out.println("Sum: "+sum);
                break;
            case 2:
                System.out.println("Enter searched category");
                String category = in.next();
                sum=0;
                for (int i=0; i<list.listSize()-1; i++){
                    if (Objects.equals(list.getCategory(i), category)){
                        sum+=list.getAmount(i);
                        list.displayExpenses(i);
                    }
                }
                System.out.println("Sum: "+sum);
                break;
            case 3:
                System.out.println("Enter searched date(min)\nDay");
                int dayMin = in.nextInt();
                System.out.println("Month");
                int monthMin = in.nextInt();
                System.out.println("Year");
                int yearMin = in.nextInt();
                System.out.println("Enter searched date(max)\nDay");
                int dayMax = in.nextInt();
                System.out.println("Month");
                int monthMax = in.nextInt();
                System.out.println("Year");
                int yearMax = in.nextInt();
                LocalDate minDate = LocalDate.of(yearMin, monthMin, dayMin);
                LocalDate maxDate = LocalDate.of(yearMax, monthMax, dayMax);
                for (int i=0; i<list.listSize()-1; i++){
                    LocalDate entryDate = LocalDate.of(list.getYear(i), list.getMonth(i), list.getDay(i));
                    if((entryDate.isEqual(minDate) || entryDate.isAfter(minDate)) && (entryDate.isEqual(maxDate) || entryDate.isBefore(maxDate))){
                        sum+=list.getAmount(i);
                        list.displayExpenses(i);
                        break;
                    }
                }
                System.out.println("Sum: "+sum);



        }
    }
}
