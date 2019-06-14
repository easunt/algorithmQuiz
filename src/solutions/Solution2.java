package solutions;

import java.util.Stack;

public class Solution2 {
    public int solution(String arrangement) {
        int answer = 0;
        int count = 0;
        char value = 0;
        Stack<Character> stack = new Stack<>();
        for(int idx = 0 ; idx < arrangement.length() ; idx++) {
            stack.push(arrangement.charAt(idx));
        }

        while(true){
            if(stack.empty())
                break;

            if(stack.peek() == ')')
                count++;
            else if (stack.peek() == '(') {
                if(value == ')') {
                    answer = answer + (--count);
                } else if(value == '('){
                    answer ++;
                    count--;
                }
            }
            value = stack.pop();
        }

        return answer;
    }

}