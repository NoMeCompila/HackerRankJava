import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class sum_integer {
    public static void main(String[] args) {
        List<Integer> miLista = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        int sumatorie =  simpleArraySum(miLista);

        System.out.println("squares = " + sumatorie);
    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = ar.stream().reduce(0, (x, y) -> x + y);
        return sum;
    }


}
