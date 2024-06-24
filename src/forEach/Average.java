package forEach;

import java.util.Arrays;
import java.util.List;

public class Average {

    public static void main(String[] args) {
        List<Integer> marks= Arrays.asList(1, 3, 6, 8, 10, 18, 36);
       double average= marks.stream()
               .mapToDouble(Integer::doubleValue)
               .average()
               .orElse(0.0);
       System.out.println(average);
    }
}
