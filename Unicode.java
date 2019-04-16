/**
 * Unicode
 */
import java.util.*;
public class Unicode {

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String ch = scn.nextLine();
        char ch_num = ch.charAt(0);
        System.out.println(Integer.toHexString((int)ch_num));
    }
}