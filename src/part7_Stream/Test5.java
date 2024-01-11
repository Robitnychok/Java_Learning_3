package part7_Stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int [] array = {3, 8, 1, 5, 9, 13, 4, 21, 81, 7, 18};
/*      array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));*/

/*      array = Arrays.stream(array).map(e -> e=e*2).filter(e -> e>20).sorted().toArray();
        System.out.println(Arrays.toString(array));*/

        int result = Arrays.stream(array)
                .filter(e -> e % 2==1)
                .map(e -> {if (e % 3 == 0){e = e / 3;} return e; })
                .reduce((a,e) -> a+e).getAsInt();

        System.out.println(result);

    }
}
