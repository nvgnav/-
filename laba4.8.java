import java.util.Scanner;

public class laba48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц");
        String x = in.nextLine();
        switch (x) {
            case "Январь" -> System.out.println("каждый понедельник и 4,11,17,27 число месяца");
            case "Февраль" -> System.out.println("каждую пятницу и 2,13,19,27 число месяца");
            case "Март" -> System.out.println("каждое воскресенье и 4,11,17,27 число месяца");
            case "Апрель" -> System.out.println("каждую субботу и  2,13,19,27 число месяца");
            case "Май" -> System.out.println("каждую среду и 4,11,17,27 4,11,17,27 число месяца");
            case "Июнь" -> System.out.println("каждую среду и 2,13,19,27 число месяца");
            case "Август" -> System.out.println("каждый четверг и 4,11,17,27 число месяца");
            case "Сентябрь" -> System.out.println("каждый четверг и 1,9,13,27 число месяца");
            case "Октябрь" -> System.out.println("каждую пятницу и 3,16,21,27 число месяца");
            case "Ноябрь" -> System.out.println("каждое воскресенье и 5,11,17,27 число месяца");
            case "Декабрь" -> System.out.println("каждую субботу и 1,8,13,19,27 число месяца");
        }
    }
}
