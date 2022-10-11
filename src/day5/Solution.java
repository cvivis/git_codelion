package day5;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for(int i = 0;i < s.length();i++){
            answer += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return answer;
    }
    public int solutionB(int n){
        //연산이용 몫, 나머지
        int answer = 0;
        while(n>9){
            answer += n % 10;
            n = n / 10;
        }
        answer += n;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int result1 = sol.solutionB(1234);

        if(result1 == 10){
            System.out.println("통과");
        }
        else{
            System.out.printf("실패 result: %d",result1);
        }
    }
}
