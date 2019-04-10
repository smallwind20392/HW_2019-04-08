/**
 * string_cut
 */
import java.util.*;
public class string_cut {

    public static void main(String[] args) {
        java.util.Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        str = str.replace(',','\n');
        System.out.println(str);
    }
}