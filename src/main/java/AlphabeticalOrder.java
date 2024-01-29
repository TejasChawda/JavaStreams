import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlphabeticalOrder {
    static Functions func = new Functions();
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amogh","Tejas C","Nikhil","Tejas S");
        func.ascendingOrder(names);
        func.descendingOrder(names);
    }
}

class Functions{
    public void ascendingOrder(List<String> words){
        List<String> sortedWords = words.stream()
                .sorted().toList();

        System.out.println(sortedWords);
    }

    public void descendingOrder(List<String> words){
        List<String> sortedWords = words.stream()
                .sorted(Comparator.reverseOrder()).toList();

        System.out.println(sortedWords);
    }


}