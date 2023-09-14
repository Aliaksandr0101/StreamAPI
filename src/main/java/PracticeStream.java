import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStream {
    public static void main(String[] args) {
        ArrayList<String> surnameEmployee = new ArrayList<>();
        surnameEmployee.add("Roberts");
        surnameEmployee.add("Doe");
        surnameEmployee.add("Johnson");
        surnameEmployee.add("Jackson");
        surnameEmployee.add("Smith");
        surnameEmployee.add("Jemp");

        List<String> surnameEmployeeOnJ = surnameEmployee.stream()
                .filter(surname -> surname.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("Employees with surname on J:");
        surnameEmployeeOnJ.stream().forEach(System.out::println);
        System.out.println();
        


        String[] strings = {"pineapple", "banana", "date",  "orange", "fig", "apple", "cherry", "mandarin"};
        Stream<String> sortedStream = Arrays.stream(strings)
                .sorted();
        System.out.println("Sorted array:");
        sortedStream.forEach(System.out::println);
    }
    }



