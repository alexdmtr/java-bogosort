import java.util.List;
import java.util.Iterator;
import java.util.Random;

public class BogoSort {
  private static <T extends Comparable<? super T>> boolean isSorted(List<T> list) {
    Iterator<T> iter = list.iterator();
    if(!iter.hasNext()) return true;

    T curr = iter.next();
    while(iter.hasNext()) {
      T next = iter.next();

      if (curr.compareTo(next) > 0)
        return false;

      curr = next;
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

  public static <T extends Comparable<? super T>> void sort(List<T> list) {
    while (!isSorted(list)) {
      shuffle(list);
    }
  }
}
