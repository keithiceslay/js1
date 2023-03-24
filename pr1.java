package s1;
import java.util.Scanner;
public class pr1 {
    public static void main(String[] args) {
// Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите число n");
    int number = iScanner.nextInt();
    int sum = 0;
    for ( int i = 1; i <= number; i++) {
        sum += i;
    }
    System.out.printf("Треугольное число от n: %d",sum);
    iScanner.close();
    }
}
