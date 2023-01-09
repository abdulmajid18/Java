package hello.fundamental.classes.StaticFields_StaticMethods;

import java.text.NumberFormat;

public class FactoryMethods {

    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percenFormatter = NumberFormat.getPercentInstance();

        double x = 0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percenFormatter.format(x));
    }

}
