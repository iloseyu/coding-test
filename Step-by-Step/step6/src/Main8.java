import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Double score = 0.0;
        int count = 0;

        for(int i=0; i<20; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            Double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            switch (grade) {
                case "A+":
                    score += 4.5 * credit;
                    count+=credit;
                    break;
                case "A0":
                    score += 4.0 * credit;
                    count+=credit;
                    break;
                case "B+":
                    score += 3.5 * credit;
                    count+=credit;
                    break;
                case "B0":
                    score += 3.0 * credit;
                    count+=credit;
                    break;
                case "C+":
                    score += 2.5 * credit;
                    count+=credit;
                    break;
                case "C0":
                    score += 2.0 * credit;
                    count+=credit;
                    break;
                case "D+":
                    score += 1.5 * credit;
                    count+=credit;
                    break;
                case "D0":
                    score += 1.0 * credit;
                    count+=credit;
                    break;
                case "F":
                    score += 0.0 * credit;
                    count+=credit;
                    break;
                default:
                    break;
            }
        }

        System.out.println(score/count);
    }
}
