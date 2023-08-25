package solutions;

public class Solution21 {
    public String solution(int num, int expired) {
        System.out.print(num);
        long expire = (long)((num + expired));
        long timeStamp = System.currentTimeMillis() / 1000;

        System.out.println(expire);
        System.out.println(timeStamp);

        return "AAA";
    }
}
