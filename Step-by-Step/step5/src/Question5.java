import java.io.*;

public class Question5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for(int i=0; i<n; i++) {
            int number = s.charAt(i);
            sum += number-48;
        }
        System.out.println(sum);
    }
}
