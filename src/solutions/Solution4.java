package solutions;

public class Solution4 {
    public int solution(int n) {
        int n1 = 1;
        int n2 = 0;
        int result = 0;
        if(n <= 1)
            return 1;

        for(int idx = 2; idx <= n ; idx++){
            int temp = (n1 + n2) % 1234567;
            n2 = n1;
            n1 = temp;
        }
        return result;
    }

    public int getPibonaci(int n){
        if(n > 2) {
            return (getPibonaci(n - 1) + getPibonaci(n - 2)) % 1234567;
        } else {
            return 1;
        }
    }
}
