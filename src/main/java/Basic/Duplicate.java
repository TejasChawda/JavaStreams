package Basic;

import java.util.Arrays;
import java.util.List;

public class Duplicate {
    static Operation op = new Operation();
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,12,14,16,19);
        op.removeDuplicates(numbers);
    }
}

class Operation{
    public void removeDuplicates(List<Integer> nums){
        System.out.println("numbers before operation : "+nums);
        List<Integer> uniqueNums = nums
                .stream()
                .distinct()
                .toList();
        System.out.println("unique numbers are : " +uniqueNums);
    }
}
