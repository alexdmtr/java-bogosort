import java.util.List;
import java.util.Random;

public class BogoSort {
  private static <T extends Comparable<T>> boolean isSorted(List<T> list) {
    for (int index = 0; index < list.size()-1; index++) {
      T current = list.get(index);
      T next = list.get(index+1);

      if (! (current.compareTo(next) <= 0))
        return false;
    }

    return true;
  }

  private static <T> void shuffle(List<T> list){
    Random randomInstance = new Random();

    for (int index = list.size()-1; index > 0; index--) {
      int randomIndex = randomInstance.nextInt(index);

      T temp = list.get(index);
      list.set(index, list.get(randomIndex));
      list.set(randomIndex, temp);
    }
  }

  public static <T extends Comparable<T>> void sort(List<T> list) {
    while (!isSorted(list)) {
      shuffle(list);
    }
  }
}
