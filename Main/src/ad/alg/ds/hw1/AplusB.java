package ad.alg.ds.hw1;

import java.io.*;
import java.util.*;

public class AplusB {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numeric = new ArrayList<>();
        int s = 0;
        String str;
        FileReader reader = new FileReader("input.txt"); // Получение чисел из файла
        Scanner sc = new Scanner(reader);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            numeric.add(a);
        }
        for (Integer aNumeric : numeric) {
            s += aNumeric;
        }
        FileWriter writer = new FileWriter("output.txt");// Запись числа в файл
        writer.write(String.valueOf(s));
        writer.close();
    }
}


