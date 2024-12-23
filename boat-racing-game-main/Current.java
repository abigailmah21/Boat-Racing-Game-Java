import java.util.*;

public class Current {
    private static int currentno;
    private static String difficulty;
    private static int forwardpush;
    private static Random random = new Random();

    public static void PrintCurrents() {
        difficulty = River.getDifficulty();
        if (difficulty.equals("Hard")) {
            currentno = random.nextInt(3, 6);
        } else if (difficulty.equals("Medium")) {
            currentno = random.nextInt(7, 10);
        } else if (difficulty.equals("Easy")) {
            currentno = random.nextInt(11, 14);
        }
        int a = currentno;
        for (int i = 0; i < a; i++) {
            int b = WhereCurrents();
            River.setRiver(b, "C");
        }
    }

    public static int WhereCurrents() {
        int b = 1;
        while ((b % 2) != 0) {
            b = random.nextInt(10, 181);
        }
        return b;
    }

    public static int PushedForwardCurrents(){
        difficulty = River.getDifficulty();
        if (difficulty.equals("Hard")) {
            forwardpush = (random.nextInt(1, 5) * 2);
        } else if (difficulty.equals("Medium")) {
            forwardpush = (random.nextInt(5, 10) * 2);
        } else if (difficulty.equals("Easy")) {
            forwardpush = (random.nextInt(10, 15) * 2);
        }
        return forwardpush;
    }
}
