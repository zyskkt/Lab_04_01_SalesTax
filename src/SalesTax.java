public class SalesTax {
    public static void main(String[] args) {
        // Initialize variables
        double itemPrice = 20;
        double salesTax = .05;

        //Calculate the tax
        double taxTotal = itemPrice * salesTax;
        double total = itemPrice + taxTotal;

        //Output
        System.out.println("With an item price of $" + itemPrice + " and a sales tax of $" + taxTotal + " your total price is $" + total + ".");




    }
}