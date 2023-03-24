package s1;
import java.util.Scanner;
public class pr2 {
   public static void main(String[] args) {
// Вычислить n! (произведение чисел от 1 до n)
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите число n");
    int number = iScanner.nextInt();
    int factorial = 1;
    for (int i = 2; i <= number; i++){
        factorial *= i;
    }
    System.out.printf("Факториал числа n: %d", factorial);
    iScanner.close();
   } 
}
