import java.util.Scanner;

public class Question6 {
    /* [2525] 오븐시계 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();

        int calcH = h;
        int calcM = m+time;

        if(0<=h && h<24 && 0<=m && m<60) {
            if(calcM > 60) {
                calcH += (calcM/60);
                calcM %= 60;
            } else if(calcM == 60) {
                calcH++;
                calcM = 0;
            }
            if(calcH > 23) {
                calcH -= 24;
            }
        }
        System.out.println(calcH + " " + calcM);
    }
}
