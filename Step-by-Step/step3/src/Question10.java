import java.io.*;

public class Question10 {
    /* [2439] 별 찍기 - 2 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++) {   //Line
            int j = n-i;
            for(int k=0; k<j; k++) {//Space
                bw.write(" ");
            }
            for(int k=0; k<i; k++) {//*
                bw.write("*");
            }
            bw.newLine();
        }
        bw.close();
    }
}
