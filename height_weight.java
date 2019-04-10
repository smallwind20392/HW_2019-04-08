/**
 * height_weight
 */
import java.util.*;
public class height_weight {
public static void main(String[] args) {
    Scanner input_1 = new Scanner(System.in);
    Scanner input_2 = new Scanner(System.in);
    float inch = input_1.nextFloat();
    float lb = input_2.nextFloat();
    System.out.println(inch * (3937/10000f));
    System.out.println(lb * (22046/10000f));
    }
}