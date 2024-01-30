package Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BigBazaar {
    static String myRole;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("NOTE : type `one` or `two` to proceed based on ur choice");
        System.out.println("ENTER YOUR ROLE : ");
        List<String> allRoles = Arrays.stream(Role.values()).map(Role::getRole).toList();
        System.out.println(allRoles);
        String choice = sc.next();
        myRole = Role.valueOf(choice).getRole();
        if(Objects.equals(myRole, "Customer")){
            customerFunctions();
        }else{
            shopkeeperFunctions();
        }
    }

    public static void customerFunctions(){
        System.out.println("How can i help you : ");
        List<String> allFunctions = Arrays.stream(CustomerFunctions.values()).map(CustomerFunctions::getFunctions).toList();
        System.out.println(allFunctions);
    }

    public static void shopkeeperFunctions(){
        System.out.println("How can i help you : ");
        List<String> allFunctions = Arrays.stream(ShopFunctions.values()).map(ShopFunctions::getChoice).toList();
        System.out.println(allFunctions);
    }
}
