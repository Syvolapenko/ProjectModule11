import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NamesTest {
    public static void main(String[] args) {
        List<Names> names =List.of(
                new Names(4,"Vlad"),
                new Names(2, "Max"),
                new Names(7, "Alex"),
                new Names(1, "Vika"),
                new Names(5,"Ira"),
                new Names(3,"Andrej")
        );

        System.out.println("Task 1 - " + sortedNamesOddNumbers(names));
        System.out.println("                     ");
        System.out.println("Task 2 - " + upperCaseNames(names));
    }
    public static List<Names> sortedNamesOddNumbers(List<Names> names){
        return names.stream()
                .filter(names1 -> names1.getNumber()%2!=0)
                .sorted(Comparator.comparing(Names::getNumber))
                .collect(Collectors.toList());
    }

    public static String upperCaseNames(List<Names>names){
        return names.stream()
                .map(names1 -> names1.getName().toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(","));
    }
}
