package solutions;

public class Solution19 {
    public String solution(String phone_number) {
        int length = phone_number.length();
        if (length == 4)
            return phone_number;

        String front = phone_number.substring(0, length - 4);
        String back = phone_number.substring(length - 4);
        System.out.println(front);
        System.out.println(back);

        return front.replaceAll("[0-9]", "*").concat(back);
    }
}
