package Advanced;

public enum ShopFunctions {

    one("Display Items"),
    two("Add Items");

    private final String choice;
    ShopFunctions(String choice) {
        this.choice = choice;
    }

    public String getChoice(){
        return choice;
    }
}
