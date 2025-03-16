import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            if ('A' <= c && c <= 'Z') {
                int index = c - 'A';
                index = (index + 13) % 26;
                c = (char) ('A' + index);
            } else if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                index = (index + 13) % 26;
                c = (char) ('a' + index);
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

}
