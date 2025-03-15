import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(br.readLine());
            stack.push(h);
        }

        int stick = stack.pop();
        while(!stack.isEmpty()) {
            if(stick<stack.peek()) {
                stick = stack.pop();
                cnt++;
            }
            else stack.pop();
        }
        System.out.println(cnt);
    }
}