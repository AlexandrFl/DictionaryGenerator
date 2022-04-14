import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Dictionary {

    public void split(String string) {
        Function<String, String[]> function = x -> x.split(" ");
        String[] r = function.apply(string);
        for (int i = 0; i < r.length; i++) {
            if (r[i].contains(",") || r[i].contains(".")) {
                r[i] = r[i].substring(0, r[i].length() - 1);
            }
        }
        List<String> list = Arrays.asList(r);
        list.stream()
                .distinct()
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
