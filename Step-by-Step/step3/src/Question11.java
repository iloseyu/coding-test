import java.util.Scanner;

public class Question11 {
    /* [10952] A+B - 5 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a!=0 || b!=0) {
                System.out.println(a+b);
            } else if(a==0 && b==0) {
                flag = false;
            }
        }
    }
}