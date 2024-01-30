package Advanced;

import lombok.Data;

@Data
public class Customer {
    String name;
    String product;
    int qty;

    public Customer(String name, String product, int qty) {
        this.name = name;
        this.product = product;
        this.qty = qty;
    }
}
