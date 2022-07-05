import java.util.ArrayList;
import java.util.List;
public class compareList {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList() {{
            add(5);
            add(6);
            add(7);
        }};

        List<Integer> list2 = new ArrayList() {{
            add(3);
            add(6);
            add(10);
        }};

        List<Integer> lista = compareTriplets(list1,list2);
        System.out.println(lista);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int sumA = 0;
        int sumB = 0;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)){
                sumA++;
            }else if (b.get(i) > a.get(i)){
                sumB++;
            }
        }

        result.add(sumA);
        result.add(sumB);
        return result;
    }
}
