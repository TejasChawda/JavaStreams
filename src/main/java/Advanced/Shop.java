package Advanced;

import lombok.Data;


@Data
public class Shop {
    public String product;
    public int price;

    public Shop(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }
}


