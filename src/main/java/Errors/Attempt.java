package Errors;

import java.util.Scanner;

public class Attempt {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        try {
            System.out.println(a/b);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Вы пытаетесь разделить на ноль");
        }finally {
            System.out.println("Код отработал");
        }
    }
}
