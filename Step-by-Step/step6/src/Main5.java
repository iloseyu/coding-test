import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            arr1.add((int)s.charAt(i));
            if(arr1.get(i)>96)
                arr1.set(i, arr1.get(i)-32);
            arr1.set(i, arr1.get(i)-65);
        }
        Collections.sort(arr1);
        ArrayList<Integer> arr2 = new ArrayList<>(25);
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i=0; i<26; i++) {
            arr2.add(i, -1);
            if(arr1.indexOf(i) != -1 && arr1.lastIndexOf(i) != -1)
                arr2.set(i, arr1.lastIndexOf(i)+1-arr1.indexOf(i));
            arr3.add(arr2.get(i));
        }
        Collections.sort(arr3);
        if(arr2.indexOf(arr3.get(25)) == arr2.lastIndexOf(arr3.get(25)))
            System.out.println((char)(arr2.indexOf(arr3.get(25))+65));
        else if (arr2.indexOf(arr3.get(25)) != arr2.lastIndexOf(arr3.get(25))) {
            System.out.println("?");
        }
    }
}
