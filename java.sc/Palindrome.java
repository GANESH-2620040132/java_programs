import java.util.Scanner;
public class Palindrome {
    static boolean ispalindrome(String str,int start,int end){
        if(start>=end) {
            return true;
        }
        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return ispalindrome(str,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (ispalindrome(str,0,str.length()-1)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}