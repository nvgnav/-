import java.util.Scanner;

public class laba45 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значения x и y ");
        double x = scn.nextDouble();
        double y = scn.nextDouble();
        if (f1(x,y)&f1tri(x,y)) System.out.println("hit 1");
        else System.out.println("no hit");
        if (f2(x,y)&f2tri(x,y)) System.out.println("hit 2");
        else System.out.println("no hit");
    }
    public static boolean f1(double x, double y){
        return (y > -6 * x - 54) & (y > 0.67 * x - 0.67) & (y > 3.67 * x + 14.33)
                & (y < 2 * x + 18) & (y < 0.25 * x + 7.5);
    }
    public static boolean f1tri(double x, double y){
        return !((y > 1.4 * x + 9.8) & (y < 6 * x + 42 & y >= 0 & x <= 6));
    }
    public static boolean f2(double x, double y){
        return (y > -1.67 * x - 5.33) & (y > 2.5 * x - 9.5) &
                (y < 6 * x + 10) & (y < 0.4 * x + 4.4) || (y > - 0.33 * x - 1 & x >= 3 & x <= 6);
    }
    public static boolean f2tri(double x, double y){
        return !((y < x + 2) & (y > - 0.83 * x + 2));
    }
}
