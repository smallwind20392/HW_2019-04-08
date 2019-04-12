/**
 * L_to_gallon
 */
import java.util.*;
public class L_to_gallon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float l = scn.nextFloat();
        System.out.println(l * (26418f/100000f));
    }
}