import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.time.DayOfWeek;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ////Task1
//        int year = 2024;
//        boolean isLeap = DateCalculator.isLeapYear.test(year);
//        System.out.println(year + " рік є високосним? " + isLeap);
//
//        LocalDate startDate = LocalDate.of(2023, 7, 1);
//        LocalDate endDate = LocalDate.of(2023, 8, 15);
//        long daysBetweenDates = DateCalculator.countDaysBetweenDates(startDate, endDate);
//        System.out.println("Кількість днів між " + startDate + " і " + endDate + " : " + daysBetweenDates + " днів");
//
//        long sundaysBetweenDates = DateCalculator.countSundaysBetweenDates(startDate, endDate);
//        System.out.println("Кількість повних неділь між " + startDate + " і " + endDate + " : " + sundaysBetweenDates);
//
//        LocalDate date=LocalDate.of(1969,7,20);
//        DayOfWeek dayOfWeek =DateCalculator.getDayofWeek(date);
//        System.out.println(date + " - " + dayOfWeek);
        ////Task2
//        Fraction fraction1=new Fraction(1,2);
//        Fraction fraction2=new Fraction(3,4);
//
//        Fraction sum=FractionCalculator.addFractions.apply(fraction1,fraction2);
//        System.out.println(fraction1 + " + " + fraction2 + " = " + sum);
//
//        Fraction difference=FractionCalculator.subtractFractions.apply(fraction1,fraction2);
//        System.out.println(fraction1 + " - " + fraction2 + " = " + difference);
//
//        Fraction multip=FractionCalculator.multiplyFactions.apply(fraction1,fraction2);
//        System.out.println(fraction1 + " * " + fraction2 + " = " + multip);
//
//        Fraction divide=FractionCalculator.divideFractions.apply(fraction1,fraction2);
//        System.out.println(fraction1 + " / " + fraction2 + " = " + divide);

        ////Task3
//        int a = 10, b = 15, c = 5, d = 20;
//        int max = NumberCalculator.maxOfFour.apply(a,
//                NumberCalculator.maxOfFour.apply(b,
//                        NumberCalculator.maxOfFour.apply(c, d)));
//        System.out.println("Максимум із чотирьох чисел: " + max);
//        int min = NumberCalculator.minOfFour.apply(a,
//                NumberCalculator.minOfFour.apply(b,
//                        NumberCalculator.minOfFour.apply(c, d)));
//        System.out.println("Мінімум із чотирьох чисел: " + min);
//        int maxWithThree=NumberCalculator.maxOfFourWhineThree.apply(a,b);
//        System.out.println("Максимум із чотирьох чисел та трьох: " + maxWithThree);
//        int minWithThree= NumberCalculator.minOfFourWithThree.apply(a,b);
//        System.out.println("Мінімум із чотирьох чисел та трьох: " + minWithThree);

    ////Task4
        int[] array={1,4,5,7,3,9,12,-9};

        int sumEqualsToFive=ArraySumCalculator.sumElem(array,s->s==7);
        System.out.println("Сума елементів масиву, що рівні 5: " + sumEqualsToFive);

        int sum2=ArraySumCalculator.sumElem(array,s->s<-3||s>8);
        System.out.println("Сума елементів масиву, що не знаходяться в діапазоні від -3 до 8: " + sum2);

        int sum3=ArraySumCalculator.sumElem(array,s->s>0);
        System.out.println("Сума додатних чисел у масиві: " + sum3);

        int sum4=ArraySumCalculator.sumElem(array,s->s<0);
        System.out.println("Сума від'ємних чисел у масиві: " + sum4);

    }
}