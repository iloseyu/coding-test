import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] arr = new int[9][9];
        ArrayList<Integer> sort = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> sorting = new ArrayList<>();
            for(int j=0; j<arr.length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sorting.add(arr[i][j]);
            }
            Collections.sort(sorting, Collections.reverseOrder());
            sort.add(sorting.get(0));
        }
        Collections.sort(sort, Collections.reverseOrder());
        bw.write(sort.get(0) + "\n");
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if(arr[i][j] == sort.get(0)) {
                    bw.write((i+1) + " " + (j+1) + " \n");
                    break;
                }
            }
        }
        bw.close();
    }
}
