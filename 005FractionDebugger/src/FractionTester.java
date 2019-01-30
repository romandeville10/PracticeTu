import javax.swing.JOptionPane;

public class FractionTester {
    private static String firstFraction;
    private static String secondFraction;
    private static String operation;
    
    
    
    public static void main(String[] args) {
        firstFraction = JOptionPane.showInputDialog("enter your first fraction:");
        secondFraction =JOptionPane.showInputDialog("enter your second fraction:");
        operation =JOptionPane.showInputDialog("enter in your operation:");
        Fraction myFraction = new Fraction(firstFraction , secondFraction, operation);
        
        System.out.println("Numerator: " + myFraction.getNumerator1() + ", Denominator: " + myFraction.getDenominator1());
        System.out.println("Numerator: " + myFraction.getNumerator2() + ", Denominator: " + myFraction.getDenominator2());
    }

}