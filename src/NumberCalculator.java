import java.util.function.BinaryOperator;
public class NumberCalculator {
    public static BinaryOperator<Integer> maxOfFour=(a,b)->Math.max(a,b);
    public static BinaryOperator<Integer> maxOfFourWhineThree=(a,b)->Math.max(Math.max(a,b),Math.max(a,b));

    public static BinaryOperator<Integer> minOfFour=(a,b)->Math.min(a,b);
    public static BinaryOperator<Integer> minOfFourWithThree=(a,b)->Math.min(Math.min(a,b),Math.min(a,b));

}
