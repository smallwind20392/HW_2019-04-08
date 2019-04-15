/**
 * Digital_encryption
 */
import java.util.*;
public class Digital_encryption {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String digital = scn.nextLine();
        int d1 = ((digital.charAt(0)-'0')+7)%10;
        int d2 = ((digital.charAt(1)-'0')+7)%10;
        int d3 = ((digital.charAt(2)-'0')+7)%10;
        int d4 = ((digital.charAt(3)-'0')+7)%10;
        System.out.println(d3+""+d4+""+d1+""+d2);
    }
}