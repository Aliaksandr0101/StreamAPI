import java.util.Scanner;

public class Calculator {
        public static double calculate(double numberOne, double numberTwo, String operator) {
            double result = 0.0;

            switch (operator) {
                case "+":
                    result = numberOne + numberTwo;
                    break;
                case "-":
                    result = numberOne - numberTwo;
                    break;
                case "*":
                    result = numberOne * numberTwo;
                    break;
                case "/":
                    if (numberTwo != 0) {
                        result = numberOne / numberTwo;
                    } else {
                        System.out.println("Сan't divide by zero");
                    }
                    break;
                default:
                    System.out.println("No such symbol");
                    break;
            }

            return result;
        }

        public static void main(String[] args) {
            String operator = null;
            double numberFirst = 0;
            double numberSecond = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pls enter first number");
            if (scanner.hasNextDouble()) {
                numberFirst = scanner.nextDouble();
            } else
            {
                System.out.println("This number does not fit");
            }
            System.out.println("Pls enter second number");
            if (scanner.hasNextDouble()) {
                numberSecond = scanner.nextDouble();
            } else
            {
                System.out.println("This number does not fit");
            }
            System.out.println("Pls enter operator + - / *");
            if (scanner.hasNextLine()) {
                scanner.nextLine();
                operator = scanner.nextLine();
            } else
            {
                System.out.println("This line does not fit");
            }

            double result = calculate(numberFirst, numberSecond, operator);
            String resultFinish = (result != 0) ? "Result: "  + result : "You enter the data incorrectly. Try again";
            System.out.println(resultFinish);
        }
    }



