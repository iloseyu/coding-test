import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> piece = new ArrayList<>();
        int chess[] ={1, 1, 2, 2, 2, 8};
        for(int i=0; i<6; i++) {
            piece.add(Integer.parseInt(st.nextToken()));
            bw.write(chess[i] - piece.get(i) + " ");
        }
        bw.close();
    }
}
