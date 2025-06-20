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
}
