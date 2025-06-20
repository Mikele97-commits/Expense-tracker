public class Sort {
    public static void category() {
        ExpenseList list = new ExpenseList();
        boolean flag = false;
        do {
            flag = false;
            for (int i=0; i< list.listSize()-1; i++){
                String category1 = list.getCategory(i);
                String category2 = list.getCategory(i+1);
                char c1 = category1.charAt(0);
                char c2 = category2.charAt(0);
                int ASCII1 = (int) c1;
                int ASCII2 = (int) c2;
                if (ASCII1 > ASCII2){
                    flag = true;
                    Expense temp = list.getExpense(i);
                    list.setExpense(i,list.getExpense(i+1));
                    list.setExpense(i+1,temp);
                }
            }

        }while(flag);
    }

    public static void amount() {
        ExpenseList list = new ExpenseList();
        boolean flag = false;
        do {
            flag = false;
            for (int i = 0; i < list.listSize() - 1; i++) {
                double amount1 = list.getAmount(i);
                double amount2 = list.getAmount(i+1);
                if (amount1 > amount2){
                    flag = true;
                    Expense temp = list.getExpense(i);
                    list.setExpense(i,list.getExpense(i+1));
                    list.setExpense(i+1,temp);
                }
            }
        }while(flag);
    }

    public static void date() {
        ExpenseList list = new ExpenseList();
        boolean flag = false;
        do{
            flag = false;
            for (int i=0; i< list.listSize()-1; i++){
                int year1 = list.getYear(i);
                int year2 = list.getYear(i+1);
                if (year1 > year2){
                    flag = true;
                    Expense temp = list.getExpense(i);
                    list.setExpense(i,list.getExpense(i+1));
                    list.setExpense(i+1,temp);
                }
            }
            for (int i=0; i< list.listSize()-1; i++){
                int year1 = list.getYear(i);
                int year2 = list.getYear(i+1);
                int month1 = list.getMonth(i);
                int month2 = list.getMonth(i+1);
                if (month1 > month2 && year1 == year2){
                    flag = true;
                    Expense temp = list.getExpense(i);
                    list.setExpense(i,list.getExpense(i+1));
                    list.setExpense(i+1,temp);
                }
            }
            for (int i=0; i< list.listSize()-1; i++){
                int year1 = list.getYear(i);
                int year2 = list.getYear(i+1);
                int month1 = list.getMonth(i);
                int month2 = list.getMonth(i+1);
                int day1 = list.getDay(i);
                int day2 = list.getDay(i+1);
                if (day1 > day2 && year1 == year2 && month1 == month2){
                    flag = true;
                    Expense temp = list.getExpense(i);
                    list.setExpense(i,list.getExpense(i+1));
                    list.setExpense(i+1,temp);
                }
            }
        }while(flag);
    }
}
