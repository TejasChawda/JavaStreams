import java.util.ArrayList;
import java.util.List;

public class average {

    static List<Integer> numbers = new ArrayList<>();
    static Computations comps = new Computations();

    public static void main(String []args){
        comps.populateList(numbers);
        comps.calculateAverage(numbers);
    }
}

class Computations{
    public void populateList(List<Integer> nums){
        nums.add(1);
        nums.add(3);
        nums.add(7);
        nums.add(9);
        nums.add(2);
    }

    public void calculateAverage(List<Integer> nums){
        double result = nums.
                stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("the average of the list provided is : "+result);
    }
}
