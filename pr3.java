package s1;
import java.util.Arrays;
public class pr3 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000
        int[] start_array = new int[169];
        start_array[0] = 1;
        int count = 1;
        NextNum:
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue NextNum;
                }
                }
            start_array[count] = i;
            count++;
        }
        //System.out.println("DF");
        System.out.println("Простые числа от 1 до 1000: ");
        System.out.println(Arrays.toString(start_array));
    }
}
