import java.util.stream.IntStream;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.Set;

public class PerfectNumberMain1_2 {
    public static void main(String[] args) {
        System.out.println("START:");
        System.out.println("set 10 then res: "+PerfectNumber.divisorsSqrt(10));
        System.out.println("set 100 then res: "+PerfectNumber.divisorsSqrt(100));
        System.out.println("set 500 then res: "+PerfectNumber.divisorsSqrt(500));
        System.out.println("set 1000 then res: "+PerfectNumber.divisorsSqrt(1000));

    }
}
class PerfectNumber {
    public static Set<Integer> divisorsSqrt(int n) {
        return IntStream
                .range(1, Math.toIntExact(Math.round(Math.sqrt(n))))
                .filter(i -> n % i == 0)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
    }
}