public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
    }
    if (rev == n) {
        System.out.println("palindrome");
    } else {
        System.out.println("Not palindrome");
    }
}
}