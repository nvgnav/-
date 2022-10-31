import java.util.Scanner;
import static java.lang.Math.*;

public class laba44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите x");
        double x = in.nextDouble();
        if (x < 0){
            System.out.println(sqrt(2) - x);
        }
        if (x > 0 & x < 2){
            System.out.println(exp(2 * (pow(x, x))));
        }
        if (x > 2){
            System.out.println((cos(x) - sin(x))/((pow(x, 2)) + 5 * x + 6));
        }
        if (x == 2 | x == 0){
            System.out.println(10000);
        }
    }

}
