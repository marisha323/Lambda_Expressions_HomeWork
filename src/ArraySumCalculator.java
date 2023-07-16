import java.util.function.Predicate;
public class ArraySumCalculator {
    public static int sumElem(int[] array,Predicate<Integer> condition){
        int sum=0;
        for (int element:array){
            if (condition.test(element)){
                sum+=element;
            }
        }
        return sum;
    }
}
