class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int x = n;
        int y = m;
        int temp = Math.min(n,m);
        
        while(x%y>0){
        temp = x%y;
        x = y;
        y = temp;
    }
        answer[0]=temp;
        
        answer[1] = (n*m)/temp;
        
        
        return answer;
    }
}