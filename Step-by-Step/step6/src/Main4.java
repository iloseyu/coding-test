import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int check = 0;
        for (int i=0; i<s.length()/2+1; i++) {
            if(s.charAt(i) == s.charAt(s.length()-(i+1)))
                check = 1;
            else {
                check = 0;
                break;
            }
        }
        System.out.println(check);
    }
}
