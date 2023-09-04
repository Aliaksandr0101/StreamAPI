import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      /*  IntStream.concat(
                IntStream.range(2,5),
                IntStream.range(0,4))
                .distinct()
                .sorted()
                .forEach(System.out::println);*/
       /* long count = IntStream.range(0, 10)
                .count();
        System.out.println(count);*/
        int firstSeq = IntStream.range(4, 5478)
                .parallel()
                .findFirst()
                .getAsInt();
        System.out.println(firstSeq);

       /* ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        boolean none = names.stream().noneMatch(s->s=="Bill");
        System.out.println(none);
*/
        boolean result = Stream.of(1, 2, 3, 4, 5)
                .noneMatch(u -> u == 3);
        System.out.println(result);

        List<String> listOne = Stream.of("a", "b", "c", "d")
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(Function.identity(), s -> s+s),
        map -> map.entrySet().stream()))
                .map(e-> e.toString())
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList));
        listOne.forEach(System.out::println);


        /*int j = 9;
        String[] arr = {"word", "mouse", "calculator"};
        Func func;
        func = (String [] arrayOne) -> {
                String preMaxWord = arrayOne[0];
                String maxWord = arrayOne[0];
                for (int i = 0; i < arrayOne.length; i++){
                    if (arrayOne[i].length() > maxWord.length()) {
                        preMaxWord = maxWord;
                        maxWord = arrayOne[i];
                    }
                }
                return maxWord;
        };
       String str = func.preMaxWord(arr);
        System.out.println(str);*/

    }
    }

