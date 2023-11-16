import java.util.List;

public class Week11 {
    /**
     * Sorts a list of comparable elements.
     *
     * @param <T> the type of elements.
     * @param list The list.
     * @return the sorted list.
     */
    public static <T extends Comparable> List<T> sortGeneric(List<T> list) {
        for (int i = 0; i < list.size(); ++i) {
            for (int j = i + 1; j < list.size(); ++j) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
