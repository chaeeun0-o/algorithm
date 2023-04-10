import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] score = {6,6,5,4,3,2,1};
        int sum = 0; 
        int zero = 0;
        
        for(int i =0; i<lottos.length; i++){
            if(lottos[i]==0){
                sum++;
            }else{
                for(int j=0; j<win_nums.length; j++){
                 if(lottos[i]==win_nums[j]){
                     sum++;
                     zero++;
                     break;
            }
             
                     
                 }
             }
        }
        
        
        answer[0] = score[sum];
        answer[1] = score[zero];        
        
        return answer;
    }
}