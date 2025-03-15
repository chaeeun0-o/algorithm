import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); //테스트 케이스

        for (int i = 0; i <n ; i++) {
            String input = br.readLine(); //입력값 한줄씩 받음
            int num = 0; // O 누적수, x면 초기화
            int sum = 0; //총점수

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O'){
                    num++;
                    sum += num;
                } else {
                    num = 0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }

}

