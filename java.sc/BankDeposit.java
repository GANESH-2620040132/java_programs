import java.util.Scanner;
public class BankDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance:");
        double balance = sc.nextDouble();
        System.out.print("Enter deposit amount:");
        double deposit = sc.nextDouble();
        balance += deposit;
        System.out.println("New Account Balance: ₹" + balance);
        sc.close();
    }
}
