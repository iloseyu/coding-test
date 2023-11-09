import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<n; i++) {
            String word = br.readLine();
            int check = 0;
            for(int j=0; j<word.length()-1; j++) {
                for(int k=j+2; k<word.length(); k++) {
                    if (word.charAt(j) != word.charAt(j+1) && word.charAt(j) == word.charAt(k))
                        check++;
                }
            }
            if(check > 0)
                continue;
            count++;
        }
        System.out.println(count);
    }
}
