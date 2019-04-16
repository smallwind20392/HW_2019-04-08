/**
 * Cylinder_volume
 */import java.util.*;
public class Cylinder_volume {

    public static void main(String[] args) {
        double PI = 3.14;
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float h = scn.nextFloat();
        System.out.println(r*r*PI*h);
    }
}