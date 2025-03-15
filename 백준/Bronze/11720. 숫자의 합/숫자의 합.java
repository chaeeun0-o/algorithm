import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");
        int sum = 0;

        for (int i = 0; i <n ; i++) {
            sum += Integer.parseInt(input[i]);
        }
        sb.append(sum).append("\n");
        System.out.println(sb.toString());
    }

}

