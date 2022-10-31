import java.util.Scanner;
import static java.lang.Math.*;

public class laba46 {
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);

        System.out.println("Введите значения x и y ");
        double x = scn.nextDouble();
        double y = scn.nextDouble();

        if (result1(x,y) && result3(x,y) && (result4(x,y)||result2(x,y))) {
            System.out.println("Точка попала");
        } else {
            System.out.println("Точка не попала");
        }

    }
    public static boolean result1(double x , double y){
        if ((x >= 0 && x*x + y*y <= 36)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean result2(double x , double y ){
        if ((y<-0.2*x+1&&x<5)&&(y>0.4*x-5)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean result3(double x, double y) {
        if ((pow(x-2,2) + pow(y-3,2) >= 4) || (pow(x-2,2) + pow(y-4,2)<=1)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean result4(double x, double y) {
        if ((pow(x-2,2)+pow(y+1,2)<=1)||(pow(x-2,2)+pow(y+3,2)<=1)) {
            return true;
        } else {
            return false;
        }
    }
}
