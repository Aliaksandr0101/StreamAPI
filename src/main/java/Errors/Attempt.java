package Errors;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Attempt {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        try {
            System.out.println(a/b);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Вы пытаетесь разделить на ноль");
        }finally {
            System.out.println("Код отработал");
        }
    }

}
class AttemptTwo{
    int a,b,c;
    Scanner scanner = new Scanner(System.in);
    public void check() throws Exception{
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        try {
            if(a < 0) {
                throw new ArithmeticException("А меньше нуля");
            }
            if ((Math.pow(b,2)-(4*a*c)) < 0) {
                throw new ArithmeticException("Дискриминант меньше нуля");
            }
        } catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }
    }
}
class AttemptThree{
    int a,b;
    Scanner scanner = new Scanner(System.in);
    public void checkTwo(){
        a = scanner.nextInt();
        b = scanner.nextInt();
        try {
            System.out.println(a/b);
        }catch(ArithmeticException arithmeticException) {

        } catch(Exception e){

        }
    }
}