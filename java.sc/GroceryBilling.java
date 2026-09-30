import java.util.Scanner;
public class GroceryBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Constant price of rice per kg
        int pricePerkg = 60;
        //Accept customer name
        System.out.print("Enter Customer name:");
        String customerName = sc.nextLine();
        //Accept quantity purchased 
        System.out.print("Enter Quantity purchased (kg)");
        double quantity = sc.nextDouble();
        //Calculate total bill
        double totalBill = quantity * pricePerkg;
        //Display bill
        System.out.println("\n============================");
        System.out.println("  GROCERY STORE BILL");
        System.out.println("==============================");
        System.out.println("Customer Name  :" + customerName);
        System.out.println("Rice price  :₹" + pricePerkg + "per kg");
        System.out.println("Quantity Purchased:" + quantity + "kg");
        System.out.println("Total Bill  :₹" + totalBill);
        System.out.println("=======================================");
        //close scanner
        sc.close();
    }
}