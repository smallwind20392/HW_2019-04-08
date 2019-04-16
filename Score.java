/**
 * Score
 */
import java.util.*;
public class Score {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Score = scn.nextInt();
        System.out.println((int)((Math.sqrt(Score))*10));
    }
}
