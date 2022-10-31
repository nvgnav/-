import static java.lang.Math.*;
import java.util.Scanner;

public class laba4711 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = in.nextDouble();
        if (x >= - 4 & x <= 4){
            if (x <= 0){
                System.out.println(2*x*x+(3*x+pow(sin(2*x),2))/(10+pow(tan(x),3)));
            }
            if (x > 0){
                System.out.println(2*exp(1)+sqrt(1+2*sin(x)));
            }
        }
        else {
            System.out.println("Данное число x не лежит в диапазоне [-4;4]");
        }
    }
}
