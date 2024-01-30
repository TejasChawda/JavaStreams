package Advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopkeeper {

    List<Shop> Products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Shop shop;

    public void addItems(){
        System.out.println("enter the product name : ");
        String prod = sc.next();
        System.out.println("enter the product price per unit price : ");
        int price = sc.nextInt();
        shop = new Shop(prod,price);
        Products.add(shop);
    }

    public void displayItems(){
        for(Shop product : Products){
            System.out.println(product.getProduct()+" - "+product.getPrice());
        }
    }

    public void showProductsUnder(int price){
        List<Shop> filteredProducts = Products.stream()
                .filter(x -> x.getPrice() < price)
                .toList();

        System.out.println("tbe products are : "+filteredProducts);
    }
}
