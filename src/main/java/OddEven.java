import java.util.Arrays;
import java.util.List;

public class OddEven {

   static Operations op = new Operations();
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,14,19,21,35,27);
        op.sumOfOddNumbers(numbers);
        op.sumOfEvenNumbers(numbers);
    }
}

class Operations {
    public void sumOfOddNumbers(List<Integer> nums){
        Integer res = nums.stream()
                .filter(x -> x%2!=0)
                .reduce(0,Integer::sum);

        System.out.println("The Odd sum is : "+res);
    }

    public void sumOfEvenNumbers(List<Integer> nums){
        Integer res = nums.stream()
                .filter(x -> x%2==0)
                .reduce(0,Integer::sum);

        System.out.println("The Even sum is : "+res);
    }
}
