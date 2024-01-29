import java.util.Arrays;
import java.util.List;


public class CountStrings {
    static Ops ops = new Ops();
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Nami","Boa","Yoyorouzu","Yamato","Tsunade","Hinata","Hoshino Ai");
        String first = "N";
        ops.countStringsStartingWith(first, words);
        ops.printNamesStartingWith(first, words);
    }
}

class Ops {
    public void countStringsStartingWith(String start, List<String> words){
        long count = words
                .stream()
                .filter(x -> x.startsWith(start))
                .count();

        System.out.println("the total count of words starting with "+start+" is : "+count);
    }

    public void printNamesStartingWith(String start, List<String> words){
        List<String> names = words
                .stream()
                .filter(x -> x.startsWith(start))
                .toList();

        System.out.println(names);
    }
}
