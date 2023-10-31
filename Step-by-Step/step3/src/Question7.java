import java.io.*;
import java.util.StringTokenizer;

public class Question7 {
    /* [11021] A+B - 7 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());

            bw.write("Case #"+(i+1)+": "
             + (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
            bw.newLine();
        }
        bw.close();
    }
}