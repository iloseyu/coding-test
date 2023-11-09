import java.io.*;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int sum = 0;

        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            if(c == 'c' && i+1 < word.length()) {
                if(word.charAt(i+1)=='=' || word.charAt(i+1)=='-') {
                    sum++;
                    i++;
                } else {
                    sum++;
                }
            } else if (c == 'd' && i+2 < word.length()) {
                if (word.charAt(i+1)=='z' && word.charAt(i+2)=='=') {
                    sum++;
                    i+=2;
                } else if (word.charAt(i+1)=='-') {
                    sum++;
                    i++;
                } else {
                    sum++;
                }
            } else if (c == 'l' && i+1 < word.length() || c == 'n' && i+1 < word.length()) {
                if(word.charAt(i+1)=='j') {
                    sum++;
                    i++;
                } else {
                    sum++;
                }
            } else if (c == 's' && i+1 < word.length()) {
                if (word.charAt(i + 1) == '=') {
                    sum++;
                    i++;
                } else {
                    sum++;
                }
            } else if (c == 'z' && i+1 < word.length()) {
                if (word.charAt(i + 1) == '=') {
                    sum++;
                    i++;
                } else {
                    sum++;
                }
            } else if (c == '=' || c == '-') {
                continue;
            } else {
                sum++;
            }
        }
        System.out.print(sum);
    }
}
