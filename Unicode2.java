/**
 * Unicode2
 */
import java.util.*;
public class Unicode2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ch16 = scn.nextLine();
        int ch10 = Integer.parseInt(ch16,16);
        System.out.println((char)ch10);
    }
}