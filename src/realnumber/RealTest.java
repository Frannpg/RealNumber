
package realnumber;

import java.util.Scanner;
/**
 * <font color="green">Main class</font> of the class Real Number
 * 
 * @see realnumber.RealNumber
 * 
 * @author <i><font color="purple" size="+1">Fco Javier Pérez Garcia</font></i>
 * @since 22/03/2022
 * @version 1.0
 */
public class RealTest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        RealNumber rn1, rn2;
        System.out.println("Input a real number");
        rn1 = new RealNumber(sc.nextDouble());
        System.out.println("Input another real number");
        rn2 = new RealNumber(sc.nextDouble());
        System.out.println("Input an integer");
        int integer = sc.nextInt();
        System.out.println(rn1.getValue() + " raised to the power of " + integer + " is " + rn1.pow(integer));
        System.out.print(rn1.getValue() + " and " + rn2.getValue() + " are");
        if(rn1.equals(rn2)){
            System.out.println(" equals");
        }else{
            System.out.println(" differents");
        }
    }
}
//ERRORS
//I put the breakpoint in line 83 of the class real number, and start debugging clicking Ctrl + f5, imput three numbers and click
//16 times on f8, we can see that the error is in the loop, i value can be 0 at start, not 1

