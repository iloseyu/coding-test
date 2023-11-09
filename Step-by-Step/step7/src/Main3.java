import java.io.*;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] word = new int[5][15];

        for(int i=0; i<5; i++) {
            String s = br.readLine();
            for (int j=0; j<s.length(); j++) {
                word[i][j] = (int)s.charAt(j);
            }
        }

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(word[j][i] != 0) {
                    bw.write((char)word[j][i]);
                }
            }
        }

        bw.close();
    }
}
