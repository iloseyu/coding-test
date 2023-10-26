import java.util.Scanner;

public class Question7 {
    /* [2480] 주사위 세개 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prize = 0;

        if (a == b) {
            if (b == c) {
                prize = 10000 + (a * 1000);
            } else if (b != c) {
                prize = 1000+(a*100);
            }
        } else if (a == c) {
            prize = 1000+(a*100);
        } else if (b == c) {
            prize = 1000+(b*100);
        } else {
            if(a>b) {
                if(a>c) {
                    prize = a*100;
                } else {
                    prize = c*100;
                }
            } else if(b>a) {
                if(b>c) {
                    prize = b*100;
                } else {
                    prize = c*100;
                }
            }
        }
        System.out.println(prize);
    }
}
