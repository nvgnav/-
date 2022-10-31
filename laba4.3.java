import java.util.Scanner;
import static java.lang.Math.*;

public class laba43 {
    public static void main(String[] args) {
        double x = -3;
        while (x <= 3){
            if (x <= -1) System.out.println(cos(x) - sin(x));
            else System.out.println(tan(x));
            x += 0.5;
        }
    }
}
