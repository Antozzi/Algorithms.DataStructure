import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int capacity = 50;
        LinearProbingHashMap<Integer, String> map = new LinearProbingHashMap<>(capacity);

        for (int i = 0; i < capacity - 1; i++) {
            int r = random.nextInt(1000);
            map.put(r, "" + i);
        }
        int key;
        int value;

        System.out.println(map);
        System.out.println(map.getSet().toString());

        key = sc.nextInt();
        System.out.println("deleted key: " + key + ". value: " + map.delete(key));
        System.out.println(map);

        key = sc.nextInt();
        System.out.println("changing value of key: " + key + ". value: " + map.get(key));
        map.put(key, "" + map.get(key) + 0);
        System.out.println(map);

        while (true) {
            key = sc.nextInt();
            value = sc.nextInt();
            System.out.println("put key: " + key + ". value: " + value);
            map.put(key, "" + value);
            System.out.println(map);

        }
    }
}