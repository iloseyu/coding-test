import java.util.Scanner;

public class Question5 {
    /* [25314] 코딩은 체육 과목 입니다 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<(n/4); i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}