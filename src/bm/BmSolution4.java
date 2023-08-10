package bm;

import java.util.regex.Pattern;

public class BmSolution4 {
    public String solution(String pathVariableUrl) {
        String[] arr = pathVariableUrl.split("/");
        String paymentIdPattern = "^[0-9]{1,9}$";
        String paymentMethodPattern = "^[a-zA-Z]{1,10}$";

        if (!arr[0].equals("") || arr.length < 4 || !Pattern.matches(paymentIdPattern, arr[2]) || !Pattern.matches(paymentMethodPattern, arr[3])) {
            return "error";
        }

        return "/" + arr[1] + "/" + arr[3] + "?paymentId=" + arr[2];
    }
}
