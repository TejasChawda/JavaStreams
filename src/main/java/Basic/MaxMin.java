package Basic;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
    static Funcs funcs = new Funcs();
    public static void main(String[] args) {
        List<Integer> nums  = Arrays.asList(12,12,13,19,22,19,27,27,46,56,43,76,89,99,99);
        funcs.findMax(nums);
        funcs.findMin(nums);
    }
}

class Funcs{
    public void findMax(List<Integer> nums){
        List<Integer> res = nums.stream()
                .max(Integer::compare)
                .stream()
                .toList();

        System.out.println("Max : "+res);
    }

    public void findMin(List<Integer> nums){
        List<Integer> res = nums.stream()
                .min(Integer::compare)
                .stream()
                .toList();

        System.out.println("Min : "+res);
    }
}
