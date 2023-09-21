//import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Solution {

    public static void main(String[] args) {
        String mockInput = "12324.134";
        Scanner scanner = new Scanner(mockInput);
        double doubleA = scanner.nextDouble();
        String doubleAUS = NumberFormat.getCurrencyInstance(Locale.US)
        .format(doubleA);
        System.out.println("US: " + doubleAUS);
        /* String doubleAIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN")) 
        .format(doubleA);
        System.out.println("India: " + doubleAIndia); */
        String doubleAChina = NumberFormat.getCurrencyInstance(Locale.CHINA)
        .format(doubleA);
        System.out.println("China: " + doubleAChina);
        String doubleAFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE)
        .format(doubleA);
        System.out.println("France: " + doubleAFrance);
        scanner.close();
    }
}

/* import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String doubleAUS = NumberFormat.getCurrencyInstance(Locale.US)
        .format(payment);
        String doubleAIndia = NumberFormat
        .getCurrencyInstance(new Locale("en", "IN")) 
        .format(payment);
        String doubleAChina = NumberFormat.getCurrencyInstance(Locale.CHINA)
        .format(payment);
        String doubleAFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE)
        .format(payment);
        
        System.out.println("US: " + doubleAUS);
        System.out.println("India: " + doubleAIndia);
        System.out.println("China: " + doubleAChina);
        System.out.println("France: " + doubleAFrance);
    }
} */