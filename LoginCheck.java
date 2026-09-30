public class LoginCheck {
    public static void main(String[] args) {
        String user = "Admin";
        int pin = 4521;
        if (user.equals("Admin")) {
            if (pin == 4521) {
                System.out.println("Access granted");
            } else {
                System.out.println("Wrong Pin");
            }
        } else {
            System.out.println("Invalid username or pin");
        }
    }
}