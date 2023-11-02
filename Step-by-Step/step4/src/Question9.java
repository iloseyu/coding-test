import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Question9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<Integer> basket = new ArrayList<>();

        for(int x=0; x<n; x++)
            basket.add(x+1);

        for(int x=0; x<m; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if(i<j && (j-i)!=0) {
                for(int y=(i-1); y<j; y++) {
                    int k = basket.get(j - 1);
                    basket.set(j - 1, basket.get(y));
                    basket.set(y, k);
                    i++;
                    j--;
                }
            }
        }
        for(int x=0; x<basket.size(); x++)
            System.out.print(basket.get(x)+" ");
    }
}
