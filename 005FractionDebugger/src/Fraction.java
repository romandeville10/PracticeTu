
import javax.swing.JOptionPane;
/**
 * Add two Fractions. Learn Javadocs. Enter the two fractions as Strings
 * Then use string methods to pull out numerator and denominator.
 * Use common denominator to add them together, then reduce to lowest common denominator
 * (first part of grading: add with javadocs)
 * (second part of grading: Add, subtract, multiply, divide with javadocs)
 * @author Jake (from state farm)
 *
 */
public class Fraction {
    //field
    private int numerator1;
    private int denominator1;
    private int numerator2;
    private int denominator2;
    private int finalNumerator;
    private int finalDenominator;
    private String operator;
    //constructor
    
    public Fraction(String passFraction1, String passFraction2, String operation) {
        int splitter1 = passFraction1.indexOf("/");
        int splitter2 = passFraction2.indexOf("/");
        String strNumerator1 = passFraction1.substring(0, splitter1);
        String strDenomiator1 = passFraction1.substring(splitter1 + 1);
        String strNumerator2 = passFraction2.substring(0, splitter2);
        String strDenomiator2 = passFraction2.substring(splitter2 + 1);
        
        this.numerator1 = Integer.parseInt(strNumerator1); 
        this.numerator2 = Integer.parseInt(strNumerator2);
        this.denominator1 = Integer.parseInt(strDenomiator1);
        this.denominator2 = Integer.parseInt(strDenomiator2);
        this.operator = operation;
        
        switch(operator) {
        case "+":
            finalNumerator = (numerator1 * denominator2)
                + (denominator1 * numerator2);
            finalDenominator = denominator1 * denominator2;
            break;
        case "-":
            finalNumerator = (numerator1 * denominator2)
                - (denominator1 * numerator2);
            finalDenominator = denominator1 * denominator2;
            break;
        case "*":
            finalNumerator = numerator1 * numerator2;
            finalDenominator = denominator1 * denominator2;
            break;
        case "/":
            finalNumerator = numerator1 * denominator2;
            finalDenominator = denominator1 * numerator2;
            break;
        default: finalNumerator = 0; finalDenominator = 1;
        }
        simplify();
        JOptionPane.showMessageDialog(null, finalNumerator +"/"+ finalDenominator);
        
    }
    //modifiers
    
    public int getNumerator1() {
        return numerator1;
    }
    
    public void setNumerator1(int numerator) {
        this.numerator1 = numerator;
    }

    public int getDenominator1() {
        return denominator1;
    }

    public void setDenominator1(int denominator) {
        this.denominator1 = denominator;
    }
    public int getNumerator2() {
        return numerator2;
    }
    public void setNumerator2(int numerator) {
        this.numerator2 = numerator;
    }

    public int getDenominator2() {
        return denominator2;
    }

    public void setDenominator2(int denominator) {
        this.denominator2 = denominator;
    }
    
    private int gcd() {
        if (finalNumerator == 0 || finalDenominator == 0)
            return 0;

        int a = Math.max(Math.abs(finalNumerator), Math.abs(finalDenominator));
        int b = Math.min(Math.abs(finalNumerator), Math.abs(finalDenominator));

        int rem = a % b;

        while (rem != 0) {
            a = b;
            b = rem;
            rem = a % b;
        }

        return b;
    }
    public void simplify() {
        if (finalNumerator != 0 && finalDenominator != 0) {
            int commonDivisor = gcd();
            finalNumerator /= commonDivisor;
            finalDenominator /= commonDivisor;
        }
    }

}
