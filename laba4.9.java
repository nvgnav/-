import java.util.Scanner;
import static java.lang.System.exit;

public class laba49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько времени ты тратишь ежедневно, играя в компьютерные игры (в часах)?");
        int ans1 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans1) {
                case 0 -> System.out.println("Ого! Да ты крутой!");
                case 1 -> System.out.println("Это достаточно хорошо! Ты почти не теряешь время зря!");
                case 2 -> System.out.println("Ты почти молодец.");
                case 3 -> System.out.println("Это не особо хорошо, но ,в принципе, можно тратить меньше времени на это.");
                case 4 -> System.out.println("Это достаточно хорошо");
                case 5 -> System.out.println("Это довольно плохо. Я думаю, что ты должен проводить гораздо меньше времени за играми и заниматься чем-то более полезным!");
                case 6 -> {
                    System.out.println("Ужас!!! Ты должен беспокоиться о своём здоровье! Я думаю, что ты должен проводить гораздо меньше времени за играми и заниматься чем-то более полезным!");
                    exit(0);
                }

            }
        System.out.println("Ты часто читаешь книги?" +
                " 1) Да" +
                " 2) Нет" +
                " 3) Больше да, чем нет" +
                " 4) Больше нет, чем да");
        int ans2 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans2) {
                case 1 -> System.out.println("Ого! Да ты крутой!");
                case 2 -> System.out.println("Наверное, ты ещё не нашёл ту самую книгу или жанр, который тебе понравиться!");
                case 3 -> System.out.println("Ты умничка! Это довольно хорошо!");
                case 4 -> {
                    System.out.println("Это не так уж и хорошо, но и не совсем плохо. Я думаю, что ты можешь иногда выделять время на чтение.");
                }
            }
        System.out.println("Ты часто занимешься спортом?" +
                " 1) часто " +
                " 2) вообще нет " +
                " 3) иногда ");
        int ans3 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans3) {
                case 1 -> System.out.println("Умничка!");
                case 2 -> System.out.println("Я думаю, что тебе стоит попробовать!");
                case 3 -> System.out.println("Это неплохо, но и не особо хорошо");
            }
        System.out.println("Сколько классов школы ты закончил?");
        int ans4 = sc.nextInt();
        sc.hasNextLine();
        {
            switch (ans4) {
                case 11 -> System.out.println("Молодец! Надеюсь твоя судьба сложится отлично!!!:)");
                case 9 -> System.out.println("Умничка! Надеюсь твоя судьба сложится отлично!!!:)");
            }
        }
        System.out.println("Спасибо за прохождение этого теста!:)");
    }
}
