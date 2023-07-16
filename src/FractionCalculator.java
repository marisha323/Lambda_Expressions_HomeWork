import java.util.function.BinaryOperator;

public class FractionCalculator {
    public static BinaryOperator<Fraction> addFractions = (fraction1, fraction2) ->
            new Fraction(fraction1.getNumerator() * fraction2.getDenominator() + fraction2.getNumerator() * fraction1.getDenominator(),
                    fraction1.getDenominator() * fraction2.getDenominator());

    public static BinaryOperator<Fraction> subtractFractions=(fraction1,fraction2)->
            new Fraction(fraction1.getNumerator()*fraction2.getDenominator()-fraction2.getNumerator()*fraction1.getDenominator(),
                    fraction1.getDenominator()*fraction2.getDenominator());

    public static BinaryOperator<Fraction> multiplyFactions=(fraction1, fraction2) ->
            new Fraction(fraction1.getNumerator()*fraction2.getNumerator(),
                    fraction1.getDenominator()*fraction2.getDenominator());

    public static BinaryOperator<Fraction> divideFractions=(fraction1, fraction2) ->
            new Fraction(fraction1.getNumerator()*fraction2.getDenominator(),
                    fraction1.getDenominator()*fraction2.getNumerator());
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменник не може бути рівний нулю!");
        }
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}