
package realnumber;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <b><font color="green">Realnumber</font> class is a class that contains real number's atributes and codes 
 * two methods called <u><font color="red">pow</font></u> and <u><font color="red">square</font></u></b>
 * 
 * @see realnumber.RealNumberTest
 * 
 * 
 * 
 * @author <i><font color="purple" size="+1">Fco Javier Pérez García</font></i>
 * @since 22/03/2022
 * @version 1.0
 */
public class RealNumber {

    private double value;

    /**
     * <font color="red">Constructor</font> that initializes atribute value
     * 
     * @param value <font color="blue">double</font>
     * 
     * @since 22/03/2022
     * @version 1.0
     */
    public RealNumber(double value) {
        this.value = value;
    }

    /**
     * <font color="red">Constructor</font> without any parameters<br><br>
     * 
     * Values are initialized with Java defaults values
     * 
     * @since 22/03/2022
     * @version 1.0
     */
    public RealNumber() {
    }

    /**
     * <font color="red">getValue</font> method returns the vale of the atribute value
     * 
     * @return value <font color="blue">double</font>
     * 
     * @since 22/03/2022
     * @version 1.0
     */
    public double getValue() {
        return value;
    }

    /**
     * <font color="red">setValue</font> method gives a value to the atribute value
     * 
     * @param value <font color="blue">double</font>
     * 
     * @since 22/03/2022
     * @version 1.0
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * <font color="red">pow</font> method<br>
     * Returns the value of the attribute value raised to the power of the
     * argument pow.
     *
     * @param pow <font color="blue">int</font>
     * @return power <font color="blue">double</font>
     * 
     * @see realnumber.RealNumber#value
     * 
     * @since 22/03/2022
     * @version 1.0
     */
    public double pow(int pow) {
        double power = 1;
        for (int i = 1; i < pow; i++) {
            power *= value;
        }
        return power;
    }

    /**
     * <font color="red">squareRoot</font> method<br>
     * Returns the  square root of the attribute value.
     *
     * 
     * @return Square root
     * 
     * @see realnumber.RealNumber#value
     * 
     * @since 22/03/2022
     * @version 1.0
     */
    
    public double squareRoot() {

        double minimun = 1, maximun = value;
        double error = 0.0000000000001, middle, intern; 
        while ((maximun - minimun) >= error) {
            middle = (minimun + maximun) / 2;
            intern = middle * middle - value;
            if (intern <= 0) {
                minimun = middle;
            } else {
                maximun = middle;
            }
        }
        BigDecimal bd = new BigDecimal(String.valueOf(maximun));
        bd = bd.setScale(6, RoundingMode.FLOOR);
        return bd.doubleValue();
    }

    /**
     * <font color="red">Equals</font> method is used to find out if two objects are of 
     * the same type and have the same data.
     * 
     * @param obj <font color="blue">Object</font>
     * @return True if are equals and false if aren't equals
     * 
     * 
     * @see realnumber.RealNumber#value
     * 
     * @since 22/03/2022
     * @version 1.0
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RealNumber other = (RealNumber) obj;
        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        return true;
    }
    
}
