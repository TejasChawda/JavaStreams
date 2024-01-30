package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Case {

    static Convert convert = new Convert();
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zero two","hinata","nami","robin","boa","bonney","vivi");
        convert.toUpper(names);
    }
}

class Convert{
    public void toUpper(List<String> words){
       Stream<String> result = words.stream().map(String::toUpperCase);
        System.out.println("here are the words after case conversion : "+result.toList());
    }
}


