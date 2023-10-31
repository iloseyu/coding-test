import java.io.*;
import java.util.*;

public class Question3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        List<Integer> array = new ArrayList<>();

        for(int i=0; i<n; i++) {
            array.add(Integer.parseInt(st.nextToken()));
            }
        Collections.sort(array);
        bw.write(array.get(0) + " " + array.get(n-1));
        bw.close();
    }
}
