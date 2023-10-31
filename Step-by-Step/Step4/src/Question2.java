import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Question2 {
    /* [10871] X보다 작은 수 */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
            if(a.get(i)<x)
                bw.write(a.get(i) + " ");
        }
        bw.close();
    }
}
