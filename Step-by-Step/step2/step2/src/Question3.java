import java.util.Scanner;

public class Question3 {
    /* [2753] 윤년 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int check = 0;

         if(year%4 == 0) {
            check = 1;
            if(year%100 == 0) {
                check = 0;
            }
            if(year%400 == 0) {
                check = 1;
            }
        }
        System.out.println(check);
    }
}
