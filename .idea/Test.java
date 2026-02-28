package idea;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test{
    public static void main(String... args){
        List<String> names = Arrays.asList("alice", "bob", "charlie",
                "david");
        //names.stream().filter(n -> n.length() >3).map(String::toUpperCase).forEach(System.out::println);
        List<String> result = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}