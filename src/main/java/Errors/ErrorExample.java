package Errors;
import java.util.Scanner;

public class ErrorExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j,k;
        System.out.println("Enter the number");
        j = scanner.nextInt();
        System.out.println("Enter the number");
        k = scanner.nextInt();

        int [] arrayNumber = new int[j];
        for (int i = 0; i < j; i++) {
            arrayNumber[i] = +k;
        }

        try{
            System.out.println("element arrayNumber = " + arrayNumber[k]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException (There is no such element in the array)");
        }

        try {
            System.out.println("result division = " + j/k);
        } catch(ArithmeticException e) {
            System.err.println("ArithmeticException (You divide by zero)");
        }


    }


}
