import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class indexOf2 {
  //Напишите метод для поиска числа в заранее отсортированном по убыванию списке
  // различных целых чисел.
  //
  //Метод должен вернуть индекс, если элемент найден, и -1, если элемент не найден.
  //
  //Используйте в качестве образца задачу 2 из классной работы.
  public static int indexOf(ArrayList<Integer> numbers, int target) {
    int right = 0;
    int left = numbers.size();
    while (right < left + 1) {
      int mid = (right + left) / 2;

      if (numbers.get(mid) == target) {
        return mid;
      }
      if (numbers.get(mid) < target) {
        right = mid - 1;
      } else {
        right = mid;
      }
    }
    if (right < numbers.size() && numbers.get(right) == target) {

      return right;
    }
    return -1;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество элементов: ");
    int n = Integer.parseInt(br.readLine());

    ArrayList<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) {
      numbers.add(Integer.parseInt(br.readLine()));
    }

    System.out.print("Введите число для поиска: ");
    int target = Integer.parseInt(br.readLine());

    System.out.println("Результат: " + indexOf(numbers, target));
  }
}


