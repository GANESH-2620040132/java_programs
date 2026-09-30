public class SkipOdd {
    public static void main(String[] args) {
        for (int i = 1; i<=7; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
