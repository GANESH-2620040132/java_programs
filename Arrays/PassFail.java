import java.util.Scanner;
public class PassFail{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[8];
        int pass = 0;
        int fail = 0;
        for(int i = 0;i<marks.length;i++){
            marks[i] = sc.nextInt();
            if(marks[i]>=40)
                pass++;
                else
                    fail++;
            }
            System.out.println("Passed = " + pass);
            System.out.println("Failed = " + fail);
        }
    }

        