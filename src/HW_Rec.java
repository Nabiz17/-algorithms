import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HW_Rec {

  /**
   * Поиск числа target в списке numbers
   *
   * @param numbers отсортированный по возрастанию список различных целых чисел
   * @param target  число, которое необходимо найти
   * @return индекс числа target в списке numbers или -1, если число не найдено
   */
  public static int indexOf(ArrayList<Integer> numbers, int target) {
    int left = 0;
    int right = numbers.size();
    while (left < right - 1) {
      int mid = (left + right) / 2;
      if (numbers.get(mid) == target) {
        return mid;
      }

      if (numbers.get(mid) < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    if (left < numbers.size() && numbers.get(left) == target) {

      return left;
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
