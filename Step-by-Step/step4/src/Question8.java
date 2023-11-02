import java.io.*;
import java.util.ArrayList;

public class Question8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0; i<10; i++) {
            int c = Integer.parseInt(br.readLine())%42;
            if(a.isEmpty())
                a.add(c);
            else {
                if(!a.contains(c))
                    a.add(c);
            }
            System.out.println("a = " + a);

        }
        System.out.println(a.size());
    }
}
