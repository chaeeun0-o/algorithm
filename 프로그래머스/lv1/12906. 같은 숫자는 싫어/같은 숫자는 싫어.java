import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
         ArrayList<Integer>list = new ArrayList<>();
        
        
        list.add(arr[0]);
        int a = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(a != arr[i]){
                list.add(arr[i]);
                a = arr[i];
            }else {
                continue;
            }
          }
            int[] answer = new int[list.size()];
            int b =0;
        
        for(int c : list){
            answer[b] = c;
            b++;
        }
        

        return answer;
    }
}