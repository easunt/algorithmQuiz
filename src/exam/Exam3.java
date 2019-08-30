package exam;

public class Exam3 {
    public static final int TID_LENGTH = 11;

    public static int numOfIds(String pool) {
        int tIdCountByPoolLength = pool.length() / TID_LENGTH;
        if (tIdCountByPoolLength < 1) {
            return 0;
        }

        int numOfEight = 0;
        for (char c : pool.toCharArray()) {
            if (c == '8') {
                numOfEight++;
            }
        }

        return Math.min(numOfEight, tIdCountByPoolLength);
    }
}
