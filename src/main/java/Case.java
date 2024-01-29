import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Case {

    static Convert convert = new Convert();
    public static void main(String[] args) {
        List<String> names = Arrays.asList("amogh","tejas","nikhil","akshay");
        convert.toUpper(names);
    }
}

class Convert{
    public void toUpper(List<String> words){
       Stream<String> result = words.stream().map(String::toUpperCase);
        System.out.println("here are the words after case conversion : "+result.toList());
    }
}


