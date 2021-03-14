package ad.alg.ds.hw1;

import java.io.*;
import java.util.Scanner;

public class Biser {

    public static void main(String[] args) throws IOException {
        int numeric;
        String str;
        FileReader reader = new FileReader("input.txt"); // Получение числа из файла
        Scanner sc = new Scanner(reader);
        str = sc.nextLine();
        numeric = Integer.parseInt(str) + 1;
        FileWriter writer = new FileWriter("output.txt");// Запись числа в файл
        writer.write(String.valueOf(numeric));
        writer.close();
    }
}


