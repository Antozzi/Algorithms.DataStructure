package ad.alg.ds.hw1;
import java.io.*;
import java.util.*;
public class GluhoiTel {
    public static void main(String[] args) throws IOException {
        String str;
        FileReader reader = new FileReader("input.txt"); // Получение числа из файла
        Scanner sc = new Scanner(reader);
        str = sc.nextLine();
        FileWriter writer = new FileWriter("output.txt");// Запись числа в файл
        writer.write(str);
        writer.close();
    }
}
