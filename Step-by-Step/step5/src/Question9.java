import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Question9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<2; i++) {
            String s = st.nextToken();
            for(int j=2; j>=0; j--) {
                int k = s.charAt(j) - 48;
                if(j==2)
                    a.add(k*100);
                else if(j==1)
                    a.set(i, a.get(i)+(k*10));
                else if(j==0)
                    a.set(i, a.get(i)+k);
            }
        }

            if(a.get(0) > a.get(1))
                System.out.println(a.get(0));
            else
                System.out.println(a.get(1));
    }
}
