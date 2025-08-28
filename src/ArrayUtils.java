import java.util.Arrays;

public final class ArrayUtils {
    private ArrayUtils() {}

    public static <T> T[] filter(T[] src, Filter<T> filter) {
        if (src == null) throw new NullPointerException("src is null");
        if (filter == null) throw new NullPointerException("filter is null");

        // Копируем, чтобы вернуть новый массив того же типа

        T[] dst = Arrays.copyOf(src, src.length);
        for (int i = 0; i < dst.length; i++) {
            dst[i] = filter.apply(dst[i]);
        }
        return dst;
    }
}
