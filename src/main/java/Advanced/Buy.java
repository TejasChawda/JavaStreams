package Advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buy {
    Scanner sc = new Scanner(System.in);
    List<Customer> customerDetails = new ArrayList<>();
    Customer cust;
    public void buy(){
        System.out.println("enter your name : ");
        String name = sc.next();
        System.out.println("enter the product name : ");
        String prod = sc.next();
        System.out.println("enter the product quantity : ");
        int qty = sc.nextInt();
        cust = new Customer(name,prod,qty);
        customerDetails.add(cust);
    }


}
