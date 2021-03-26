import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Написать программу по возведению числа в степень с помощью рекурсии.
        System.out.println("2^10=" + pow(2, 10));


        //Написать программу «Задача о рюкзаке» с помощью рекурсии
        List<Vesch> veschi = new ArrayList<>();
        veschi.add(new Vesch("Книга", 1, 600));
        veschi.add(new Vesch("Бинокль", 2, 5000));
        veschi.add(new Vesch("Аптечка", 4, 1500));
        veschi.add(new Vesch("Ноутбук", 2, 40000));
        veschi.add(new Vesch("Одеяло", 1, 500));

        int maxWeight = 5;

        Rukzak rukzak = new Rukzak(maxWeight);
        rukzak.makePodbor(veschi);
        System.out.println("Это полный набор вещей:");
        System.out.println(veschi);
        System.out.println("Создаем оптимальный набор вещей:");
        System.out.println(rukzak.getNabor());
    }

    private static long pow(int num, int pow)
    {
        if (pow == 1)
            return num;

        return num * pow(num, pow - 1);
    }

}