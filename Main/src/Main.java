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
        /**
        /* 3*. Сделать возможность расширения внутреннего массива у стека и очереди.
         MyStack.java - Line 25
         MyQueue.java - Line 45         */

        MyStack<String> myStack = new MyStack<>();
        myStack.push("asd");
        myStack.push("bnm");
        myStack.push("cdfg");
        myStack.push("dffghfghfg");
        for (int i = 0; i < 4; i++) {
            System.out.println(myStack.pop());
        }
        Expression expression = new Expression("(( [7] + {-8*a} + t ])");
        System.out.println(expression.checkBracket());
        MyQueue<Integer> myQueue = new MyQueue<>();
        for (int i = 0; i < 5; i++) {
            myQueue.insert(i * 10);
        }
        System.out.println(myQueue);
        for (int i = 0; i < 5; i++) {
            System.out.print(myQueue.remove());
        }
        System.out.println(myQueue);
    }

}
