import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("알파벳" + s.charAt(i) + (((int) c % 65)));
            if(((int)c%65)==18 || ((int)c%65)>=24 || ((int)c%65)==21) {
                System.out.println((((int) c % 65) / 3) + 2);
                sum+=(((int) c % 65) / 3) + 2;
            } else {
                System.out.println((((int) c % 65) / 3) + 3);
                sum+= (((int) c % 65) / 3) + 3;
            }
            //System.out.println((((int)c%65)/3)+3);
        }
        System.out.println(sum);
    }
}
