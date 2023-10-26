import java.util.Scanner;

public class Question2 {
    /* [9498] 시험성적 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        char grade = 'A';
        int marking = score/10;

        switch (marking) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println(grade);
    }
}
