import java.util.Scanner;

public class Question12 {
    /* [10951] A+B - 4 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a<=0 || b>=10) {
                break;
            } else {
                System.out.println(a+b);
            }
        }
    }
}
