import java.util.Scanner;
public class SmartLockerAvaliability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Accept locker number from the user
        System.out.print("Enter Locker Number:");
        int lockerNumber = sc.nextInt();
        //Check weather the locker is valid
        if (lockerNumber>= 1 && lockerNumber <= 20) {
            System.out.println("Locker Available");
        } else {
            System.out.println("Invalid Locker Number");
        }
        sc.close();
    }
}