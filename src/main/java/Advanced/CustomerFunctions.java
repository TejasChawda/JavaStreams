package Advanced;

public enum CustomerFunctions {
    one("Display Items"),
    two("Show Items Under : 50, 100, 200, 500, 2000 ");

    private final String choice;
    CustomerFunctions(String  choice) {
        this.choice = choice;
    }

    public String getFunctions(){
        return choice;
    }
}
