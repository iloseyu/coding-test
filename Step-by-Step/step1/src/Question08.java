import java.util.Scanner;

public class Question08 {
    /* [18108] 1998년생인 내가 태국에서는 2541년생?! */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 2541-1998;
        int y = sc.nextInt();

        System.out.println(y-year);
    }
}
