package Advanced;

public enum Role {

    one("Shopkeeper"),
    two("Customer");

    private final String ch;

    Role(String choice) {
        this.ch = choice;
    }

    public String getRole(){
        return ch;
    }
}
