import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      List<Integer> ints = Arrays.asList(4, 3, 6, 2, 4, 7, 3);

      BogoSort.sort(ints);

      for (Integer x : ints) {
        System.out.printf("%d ", x);
      }
    }
}
