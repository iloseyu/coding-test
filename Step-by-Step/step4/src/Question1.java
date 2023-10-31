import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Question1 {
    /* [10807] 개수 세기 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        List<Integer> array = new ArrayList<>();
        int check = 0;

        for(int i=0; i<n; i++) {
            array.add(Integer.parseInt(st.nextToken()));
            if(array.get(i)==v)
                check++;
        }

        System.out.println(check);

    }
}
