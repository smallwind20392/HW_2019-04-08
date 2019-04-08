/**
 * total_average
 */

import java.util.*;
public class total_average {
    public static void main(String[] args) {
        Scanner scn_1 = new Scanner(System.in);
        Scanner scn_2 = new Scanner(System.in);
        Scanner scn_3 = new Scanner(System.in);
        int ch = scn_1.nextInt();
        int eng = scn_2.nextInt();
        int math = scn_3.nextInt();
        int all = ch+eng+math ;
        System.out.print("Total score is ");
        System.out.println(ch+eng+math);
        System.out.print("average is ");
        System.out.println(all/3);
    }
}