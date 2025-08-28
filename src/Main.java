import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Integer[] b = ArrayUtils.filter(a, x -> x * 2); // [2, 4, 6]
        System.out.println(Arrays.toString(b));
    }
}