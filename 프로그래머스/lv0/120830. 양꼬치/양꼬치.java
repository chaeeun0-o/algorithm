class Solution {
    public int solution(int n, int k){
    
    
        int ram = n*12000;
        int free = n/10;
        int count = 0;
        int answer = 0;
    
        count=k-free;
            
            if(count!=0){
                answer = (n*12000)+(count*2000); 
            }else{ 
                answer = (n*12000)+(count*2000);
            }
    
    return answer;
}
}