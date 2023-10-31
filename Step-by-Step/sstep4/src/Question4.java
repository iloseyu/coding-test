import java.util.*;

public class Question4 {
    /* [2562] 최댓값 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i=0; i<9; i++) {
            int n = sc.nextInt();
            arr1.add(n);
            arr2.add(n);
        }
        Collections.sort(arr2);
        System.out.println(arr2.get(8));
        for(int i=0; i<9; i++) {
            if(arr2.get(8).equals(arr1.get(i)))
                System.out.println(i+1);
        }

    }
}
