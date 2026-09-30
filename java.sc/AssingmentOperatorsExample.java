import java.util.Scanner;
public class AssingmentOperatorsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // = Assingment Operator
        int value = num;
        System.out.println("\nAfter '=' Assigment:" + value);

        // +=Add and Assign
        value += 10;
        System.out.println("After '+=' (Add10) :" + value);

        // -=Subtract and Assgin
        value -= 5;
        System.out.println("After '-=' (subtract5):" +value);

        // */=Multiply and Assign
        value *= 2;
        System.out.println("After '*=' (Multiply by 2):" + value);

        // /=Dvide and Assgin
        value /= 3;
        System.out.println("After '/=' (Divide by 3):" + value);

        //%= Modulus and Assgin
        value %= 4;
        System.out.println("After'%=' (Modulus by 4): " + value);
        sc.close();
    }
}