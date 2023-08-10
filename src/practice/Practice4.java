package practice;

public class Practice4 {
    public int[] solution(String[] park, String[] routes) {
        int y = park.length;
        int x = park[0].length();
        int xPos = 0;
        int yPos = 0;

        for (int idx = 0; idx < park.length; idx++) {
            String p = park[idx];
            int index = p.indexOf("S");
            if (index != -1) {
                xPos = index;
                yPos = idx;
            }
        }

        for (String route : routes) {
            String[] routeArray = route.split(" ");
            String direction = routeArray[0];
            Integer step = Integer.parseInt(routeArray[1]);
            int prevX = xPos;
            int prevY = yPos;

            switch (direction) {
                case "E":

            }
        }


        int[] answer = {};
        return answer;
    }
}
