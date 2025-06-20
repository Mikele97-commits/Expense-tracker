import java.util.ArrayList;

public class ExpenseList {
   static ArrayList<Expense> expenses = new ArrayList<>();
    public void addExpense(double amount, String description, String category, int year, int month, int day){
        expenses.add(new Expense(amount, description, category, year, month, day));
    }
    public Expense getExpense(int index){
        return expenses.get(index);
    }

    public void setExpense( int index,Expense expense){
        expenses.set(index, expense);

    }
    public double getAmount(int i){
        return expenses.get(i).getAmount();
    }
    public String getDescription(int i){
        return expenses.get(i).getDescription();
    }
    public String getCategory(int i){
        return expenses.get(i).getCategory();
    }
    public int getYear(int i){
        return expenses.get(i).getYear();
    }
    public int getMonth(int i){
        return expenses.get(i).getMonth();
    }
    public int getDay(int i){
        return expenses.get(i).getDay();
    }

    public void displayExpenses(int i){
        System.out.println("Amount: " + expenses.get(i).getAmount()+ "\nCategory: " + expenses.get(i).getCategory()+"\nDescription:" + expenses.get(i).getDescription()+"\nDate: " +expenses.get(i).getYear()+"-"+expenses.get(i).getMonth()+"-"+expenses.get(i).getDay());
    }

    public int listSize(){
       return expenses.size();
    }
}
