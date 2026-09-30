public class Countdown {
    static void Countdown(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        Countdown(n-1);
    }
    public static void main(String[] args){
        Countdown(10);
    }
}

