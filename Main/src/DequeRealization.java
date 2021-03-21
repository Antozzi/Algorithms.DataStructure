import java.util.Deque;
import java.util.Iterator;


public class DequeRealization {

    public static void dequeExample1(Deque<String> dq) {

        // Мы можем добавлять элементы в очередь различными способами
        dq.add("Element 1 (Tail)"); // добавить в хвост
        dq.addFirst("Element 2 (Head)");
        dq.addLast("Element 3 (Tail)");
        dq.push("Element 4 (Head)"); // добавить в голову
        dq.offer("Element 5 (Tail)");
        dq.offerFirst("Element 6 (Head)");
        dq.offerLast("Element 7 (Tail)");
        System.out.println(dq + "\n");
    }

    public static void dequeExample2(Deque<String> dq) {
        // Перебираем элементы очереди.
        System.out.println("Standard Iterator");
        Iterator iterator = dq.iterator();
        while (iterator.hasNext()) System.out.println("\t" + iterator.next());
    }

    public static void dequeExample3(Deque<String> dq) {
        // Итератор обратного порядка
        Iterator reverse = dq.descendingIterator();
        System.out.println("Reverse Iterator");
        while (reverse.hasNext()) System.out.println("\t" + reverse.next());
        // Peek возвращает голову, не удаляя это из dq
        System.out.println("Peek " + dq.peek());
        System.out.println("After peek: " + dq);
        // Pop возвращает голову и удаляет ее из dq
        System.out.println("Pop " + dq.pop());
        System.out.println("After pop: " + dq);
        // Мы можем проверить, существует ли конкретный элемент в dq
        System.out.println("Contains element 3: " + dq.contains("Element 3 (Tail)"));
        // Мы можем удалить первый или последний элемент.
        dq.removeFirst();
        dq.removeLast();
        System.out.println("Deque after removing " + "first and last: " + dq);
    }
}
