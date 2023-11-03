import java.io.*;
import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        ArrayList<Integer> str = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int ask = s.charAt(i) - 97;
            //if(!str.contains(ask))
                str.add(ask);
        }

        System.out.println(str);

        for(int i=0; i<26; i++){
            if(str.contains(i))
                bw.write(str.indexOf(i) + " ");
            else
                bw.write(-1 + " ");
        }
        bw.close();

    }
}