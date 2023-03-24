package s1;
import java.util.Scanner;
public class pr4 {
    public static void main(String[] args) {
        //Реализовать простой калькулятор
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите перое число");
        int a = iScanner.nextInt();
        iScanner.nextLine();
        System.out.println("Введите операцию, которую зотите совершить (*, /, +, -)");
        String  operation = iScanner.nextLine();
        System.out.println("Введите второе число");
        int b = iScanner.nextInt();
        switch (operation) {
            case "*": 
                System.out.printf("a * b = %d", a*b);
                break;
            case "/": 
                System.out.printf("a / b = %d", a/b);
                break;
            case "+": 
                System.out.printf("a + b = %d", a+b);
                break;
            case "-": 
                System.err.printf("a - b = %d", a-b);
                break;
        }
        iScanner.close();
    }
}
