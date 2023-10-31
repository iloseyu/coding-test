import java.io.*;
import java.util.StringTokenizer;

public class Question5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arrBasket = new int[n];
        for(int i=0; i<n; i++) {
            arrBasket[i] = 0;
        }

        for(int x=0; x<m; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(int y=(i-1); y<j; y++) {
                arrBasket[y] = k;
            }
        }
        for(int z=0; z<n; z++)
            System.out.print(arrBasket[z] + " ");
    }
}
