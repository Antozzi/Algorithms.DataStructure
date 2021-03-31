package ad.algd.hw6;

/**
 * 1. Создать и запустить программу для построения двоичного дерева.
 * В цикле построить двадцать деревьев с глубиной в 6 уровней.
 * Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int. Число, которое попадает в узел,
 * должно генерироваться случайным образом в диапазоне от -100 до 100.
 * 2. Проанализировать, какой процент созданных деревьев являются несбалансированными.
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int nTrue = 0, nFalse = 0;
        Random random = new Random();
        int last = 0;
        String prcnt = null;

        for (int i = 0; i < 200000; i++) {
            MyTreeMap<Integer, String> map = new MyTreeMap<>();
            while (map.height() < 7) {
                last = random.nextInt(100) - 200;
                map.put(last, "String");
            }
            map.delete(last);
            if (map.isBalanced()) {
                nTrue++;
            } else {
                nFalse++;
            }

            prcnt = String.format("%.3f", ((float) (nTrue / nFalse) * 100));
        }

        System.out.println("Balanced: " + nTrue + "; Unbalanced: " + nFalse + ". Which is: " + prcnt + "%");
    }
}
