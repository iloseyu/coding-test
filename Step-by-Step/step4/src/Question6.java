import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Question6 {
    /* [10813] 공바꾸기 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> basket = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int x=0; x<n; x++)
            basket.add(x, x+1);

        for(int x=0; x<m; x++) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            int k = basket.get(i);
            basket.set(i, basket.get(j));
            basket.set(j, k);
        }

        Consumer<Integer> lambda = item -> System.out.print(item + " ");
        basket.forEach(lambda);
    }
}
