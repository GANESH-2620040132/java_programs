import java.util.Scanner;
public class ExamEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name:");
        String name = sc.nextLine();
        System.out.print("Enter attendance percentage:");
        int attendance = sc.nextInt();
        if(attendance >= 75) {
            System.out.print(name + ": Eligible for examination");
        } else {
            System.out.print(name + ": Not eligible for examination");
        }
        sc.close();
    }
}