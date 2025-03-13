import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder qwe = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] words = br.readLine().split(" ");

            for (int j = 0; j < words.length; j++) {
                qwe.append(words[j]).reverse();
                answer.append(qwe.toString());

                if (j != words.length - 1){
                    answer.append(" ");
                }

                qwe.delete(0, qwe.length());
            }
            answer.append("\n");
        }
        System.out.println(answer);

    }

}
