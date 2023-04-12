class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int sum = 0;
        int num = 0;
        
        for(int i=0; i<num_list.length; i++){
             if(num_list[i]%2==0){
                 sum++;
            } else{
                 num++;
             }
        }
        answer[0] = sum;
        answer[1] = num;

        return answer;
    }
}