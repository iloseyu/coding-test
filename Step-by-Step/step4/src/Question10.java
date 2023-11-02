import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Question10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> sub = new ArrayList<>();
        double avg = 0.00;

        while (st.hasMoreTokens()){
            sub.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(sub, Collections.reverseOrder());

        for(int i=0; i<n; i++) {
            avg += (double)sub.get(i)/sub.get(0)*100;
        }

        System.out.println(sub);
        System.out.println("평균 " + avg/n);
    }
}
