/**
 * Operation
 */
import java.util.*;
public class Operation {
    public static void main(String[] args) {
        Scanner input_1 = new Scanner(System.in);
        int a = input_1.nextInt();
        int b = input_1.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b)+"..."+(a%b));        
}
}