import java.util.Scanner;
public class ShoppingCartPrinter {
    public static void main(String args[]){
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();
        String data1, data2;
        int price1, quantity1, price2, quantity2;
        Scanner input = new Scanner(System.in);
        System.out.println("Item 1");                       //item 1
        System.out.println("Enter the item name: ");
        data1 = input.nextLine();
        item1.setName(data1);                               //set item1
        System.out.println("Enter the item price: ");
        price1 = input.nextInt();
        item1.setPrice(price1);                             //set price1
        System.out.println("Enter the item quantity: ");
        quantity1 = input.nextInt();
        item1.setQuantity(quantity1);                      //set quantity1

        System.out.println();

        System.out.println("Item 2");                       //item 2
        input.nextLine();
        System.out.println("Enter the item name: ");
        data2 = input.nextLine();
        item2.setName(data2);
        System.out.println("Enter the item price: ");
        price2 = input.nextInt();
        item2.setPrice(price2);
        System.out.println("Enter the item quantity: ");
        quantity2 = input.nextInt();
        item2.setQuantity(quantity2);

        System.out.println("TOTAL COST");

        item1.printTotalCost();                                  //print deets
        item2.printTotalCost();
        System.out.println();
        System.out.println( "Total: $" + (( item1.getQuantity()*item1.getPrice() ) + (item2.getQuantity() * item2.getPrice())) );
input.close();
    }
}
