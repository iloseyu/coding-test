import java.util.Scanner;

public class Question4 {
    /* [25304] 영수증 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int num = sc.nextInt();
        int sum = 0;

        for(int i=0; i<num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = sum + (a*b);
        }
        if(sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
