import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i=0; i<schedules.length; i++) {
            int time = schedules[i]+10;
            if(time%100>=60) time += 40;
            boolean flag = true;
            for(int j=0; j<timelogs[i].length; j++) {
                if((startday+j)%7>0 && (startday+j)%7<6){
                    if(timelogs[i][j]>time) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) answer++;
        }
        
        
        return answer;
    }
}