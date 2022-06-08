import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        // create items
        Item item1 = new Item("coffee", 2.75);
        Item item2 = new Item("bagel", 3.95);
        Item item3 = new Item("juice", 3.20);
        Item item4 = new Item("muffin", 3.65);
    
        // ------test cases------
        // create 2 orders w/o names
        Order order1 = new Order();
        Order order2 = new Order();

        // create 3 orders using overloaded method
        Order order3 = new Order("John");
        Order order4 = new Order("Tom");
        Order order5 = new Order("Jerry");

        // add items to orders
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item3);
        order4.addItem(item2);
        order4.addItem(item4);
        order5.addItem(item2);
        order5.addItem(item3);

        // order status
        order1.setReady(true);
        order2.setReady(true);
        order5.setReady(true);

        // check order status
        System.out.println("-----order status------");
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        // order total
        System.out.println("-----order total------");
        System.out.printf("$%.2f\n", order1.getOrderTotal());
        System.out.printf("$%.2f\n", order2.getOrderTotal());
        System.out.printf("$%.2f\n", order3.getOrderTotal());
        System.out.printf("$%.2f\n", order4.getOrderTotal());
        System.out.printf("$%.2f\n", order5.getOrderTotal());

        // display order info
        System.out.println("-----display order------");
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        
    }
}
