import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    //    Задача 1
    //Найти минимальное чётное число в последовательности положительных чисел или вывести -1,
    // если такого числа не существует.

    //Оценить временную и пространственную сложность алгоритма.

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество чисел: ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Введите " + n + " положительных чисел, каждое с новой строки:");

    int evenMin = Integer.MAX_VALUE;
    int result = -1;
    for (int i = 0; i < n; ++i) {
      int x = Integer.parseInt(br.readLine());
      if ((x % 2 == 0) && (x < evenMin)) {
        evenMin = x;
        result = 0;
      }
    }
    if (result == -1) {
      System.out.println(result);
    } else {
      System.out.println(evenMin);
    }
  }
}
