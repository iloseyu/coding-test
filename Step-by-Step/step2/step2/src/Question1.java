import java.util.Scanner;

public class Question1 {
    /* [1330] 두 수 비교하기 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {
            System.out.println(">");
        } else if(a<b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
