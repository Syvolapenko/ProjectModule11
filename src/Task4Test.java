import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4Test {
    public static void main(String[] args) {

        Task4 task4 = new Task4();
        task4.setA(25214903917l);
        task4.setC(11);
        task4.setM(2^48);
        Stream<Long> stream = Stream.iterate(Long.valueOf(0), x -> (task4.getA() * x + task4.getC()) % task4.getM());
        stream
                .limit(5)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
