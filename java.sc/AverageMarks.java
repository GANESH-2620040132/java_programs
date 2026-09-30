import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int marks = a+b+c;
        double average = marks/3.0;
        System.out.println("Total marks: " + marks);
        System.out.println("average marks: " + average);
    }
}