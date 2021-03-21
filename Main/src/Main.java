import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
        String str = "Шла Саша по шоссе и сосала сушки";
        System.out.println(ReverseString.reverseString(str));

        //2. Создать класс для реализации дека.
        Deque<String> dq = new LinkedList<>();
        DequeRealization.dequeExample1(dq);
        DequeRealization.dequeExample2(dq);
        DequeRealization.dequeExample3(dq);

        //3*. Сделать возможность расширения внутреннего массива у стека и очереди.
    }

}
