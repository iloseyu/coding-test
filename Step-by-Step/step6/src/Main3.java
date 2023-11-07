import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        for(int i=0; i<(n*2)-1; i++) {
            if (i < n) {
                for(int j=0; j<(n-i)-1; j++)
                    bw.write(" ");
                for(int j=0; j<(i*2)+1; j++)
                    bw.write("*");
            } else if (i == n - 1) {
                for(int j=0; j<(n*2)-1; j++)
                    bw.write("*");
            } else if (i >= n) {
                for(int j=0; j<(i-(n-1)); j++)
                    bw.write(" ");
                for(int j=0; j<(2*n)-(2*(i%n)+3); j++)
                    bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
