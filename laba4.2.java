import java.util.Scanner;
import static java.lang.Math.*;

public class laba42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите номер квартиры");
        double n = in.nextDouble();
        double N = 1;
        if (n < 1){
            System.out.println("ошибка");
        }
        if (n % 5 == 0){
            System.out.println(n / 5);
        }
        if (n % 5 != 0){
            System.out.println(N + round(n / 5));
        }
    }
}
