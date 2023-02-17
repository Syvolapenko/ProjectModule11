import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class List {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};

            String number = Arrays.stream(array)
                     .map(x -> Arrays.asList(x.split(", ")))
                    .peek(System.out::println)
                     .flatMap(Collection::stream)
                    .peek(System.out::println)
                     .sorted()
                     .collect(Collectors.joining(", "));

        System.out.println("-------------------");
        System.out.println(number);
    }
}
