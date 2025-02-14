import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter your item price: ");
        int itemPrice = console.nextInt();
        double shippingPrice = 0;

        if (itemPrice < 100){
            shippingPrice = itemPrice * 0.02;
        }

        double totalPrice = itemPrice + shippingPrice;

        System.out.println("Your shipping price is: " + shippingPrice);
        System.out.println("Your total price is: " + totalPrice);
    }
}
