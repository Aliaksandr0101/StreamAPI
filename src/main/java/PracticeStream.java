import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    }
}
