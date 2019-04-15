/**
 * ASCII
 */
import java.util.*;
public class ASCII {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String symbol = scn.nextLine();
        int ascii ;
        ascii = symbol.charAt(0);
        System.out.println(ascii);
    }
}