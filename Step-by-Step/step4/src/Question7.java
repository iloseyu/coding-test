import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {
    /* [5597] 과제 안 내신 분..? */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<Boolean> arr = new ArrayList<>();
        for(int i=0; i<28; i++) {
            id.add(sc.nextInt());
        }
        for(int i=0; i<30; i++) {
            arr.add(id.contains(i+1));
            if(arr.get(i).equals(false))
                bw.write(i+1 + " ");
        }
        bw.close();
    }
}
