import java.util.Scanner;

public class Question5 {
    /* [2884] 알람시계 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(0<=h && h<24 && 0<=m && m<60) {
            if(m >= 45) {
                m -= 45;
            } else {
                m += 15;
                h--;
            }
            if(h<0) {
                h = 23;
            } else if(h>23) {
                h = 0;
            }
        }
        System.out.println(h + " " + m);
    }
}
