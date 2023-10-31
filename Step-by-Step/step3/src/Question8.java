import java.io.*;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question8 {
    /* [11022] A+B - 8 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i=1; i<=t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a+b;
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + c);
            bw.newLine();
        }
        bw.close();
    }
}