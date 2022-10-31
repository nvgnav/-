import java.util.Scanner;
import static java.lang.Math.*;

public class laba471 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = in.nextDouble();
        if (x >= -4 & x <= 4){
            if(x<0)
                System.out.println(sqrt(cos(2*x+1)+(exp(x*x))/(exp(1)+x*x)));
            else if(x<=1)
                System.out.println(2*pow(cos(pow(sin(x),3)),2));
            else System.out.println(sqrt(1/(x-2)+abs(2*sin(abs(pow(3*x,0.25))))));
        }
        else
            System.out.println("Данное число x не лежит в диапазоне [-4;4]");
    }
}
