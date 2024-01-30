package Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AlphabeticalOrder {
    static Functions func = new Functions();
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nami","Robin","Boa","Hoshino Ruby","Hoshino Ai","Tsunade","Arima Kana");
        func.ascendingOrder(names);
        func.descendingOrder(names);
    }
}

class Functions{
    public void ascendingOrder(List<String> words){
        List<String> sortedWords = words.stream()
                .sorted().toList();

        System.out.println("Ascending Order : "+sortedWords);
    }

    public void descendingOrder(List<String> words){
        List<String> sortedWords = words.stream()
                .sorted(Comparator.reverseOrder()).toList();

        System.out.println("Descending order : "+sortedWords);
    }


}