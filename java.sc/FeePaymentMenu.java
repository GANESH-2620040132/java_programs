import java.util.Scanner;
public class FeePaymentMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-pay Full fee\n2-pay Installment\n3-view Dues\n4-Exit");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            System.out.println("processing full fee payment...");
            break;
            case 2:
                System.out.println("processing Installment payment....");
                break;
                case 3:
                    System.out.println("Fetching due details....");
                    break;
                    case 4:
                        System.out.println("Exiting portal......");
                        break;
                        default:
                            System.out.println("Invalid choice");
        }
    }
    }

