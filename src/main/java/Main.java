import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.concat(
                IntStream.range(2,5),
                IntStream.range(0,4))
                .distinct()
                .sorted()
                .forEach(System.out::println);
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

