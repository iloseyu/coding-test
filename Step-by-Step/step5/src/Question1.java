import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = sc.nextInt();
        System.out.println(s.charAt(i-1));
    }
}
