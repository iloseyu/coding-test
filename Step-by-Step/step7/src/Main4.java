import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int number = Integer.parseInt(br.readLine());
        int[][] paper = new int[100][100];
        int area = 0;

        for(int i=0; i<number; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j=x; j<x+10; j++) {
                for(int k=y; k<y+10; k++) {
                    paper[j][k]++;
                    if(paper[j][k] == 1)
                        area++;
                }
            }
        }
        System.out.println(area);
    }
}