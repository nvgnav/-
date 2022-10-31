import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;

public class laba41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите первое число");
        double a = in.nextDouble();
        System.out.println("введите второе число");
        double b = in.nextDouble();
        System.out.println("введите третье число");
        double c = in.nextDouble();
        System.out.println("введите четвёртое число");
        double d = in.nextDouble();
        double e = 1;
        double f = 1;
        if (a < 0){
            e *= a;
        }
        else{
            f *= a;
        }
        if (b < 0){
            e *= b;
        }
        else{
            f *= b;
        }
        if (c < 0){
            e *= c;
        }
        else{
            f *= c;
        }
        if (d < 0){
            e *= d;
        }
        else{
            f *= d;
        }
        if (abs(e) > abs(f)){
            System.out.println(e);
        }
        else{
            System.out.println(f);
        }
    }
}
