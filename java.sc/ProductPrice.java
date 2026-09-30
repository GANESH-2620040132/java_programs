import java.util.Scanner;
class ProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int price = sc.nextInt();
        int totalamount = quantity*price;
        System.out.println("product price =" + price);
        System.out.println("Product quantity ="+ quantity);
        System.out.println(totalamount);
    }
}