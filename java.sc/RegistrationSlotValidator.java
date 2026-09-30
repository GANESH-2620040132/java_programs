import java.util.Scanner;
public class RegistrationSlotValidator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter day (1=mon....7=sun)");
    int day = sc.nextInt();
    System.out.println("Enter hour(0-23)");
    int hour = sc.nextInt();
    if (day>= 1 & day <= 5) {
       if (hour >9 & hour < 17) {
        System.out.println("Registration Allowed");
       } else {
        System.out.println("Registration closed - outside Hours");
       }
    } else {
        System.out.println("Registration closed - weekend");
    }
}
}
    
       