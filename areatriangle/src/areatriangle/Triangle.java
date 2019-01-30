package areatriangle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangle {

	//class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	private String theAngles;
	
	Scanner keyboard = new Scanner(System.in);
	
	
	//constructor goes here
	public Triangle() {
		
		setVarsToZero();
		
	}


	//methods go here
	public void setVarsToZero() {
		
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;
		
	}	
	//end of set vars
	
	public void ShowVars() {
	 System.out.println("side a = " + sideA);
	 System.out.println("side b = " + sideB);
	 System.out.println("side c = " + sideC);
	 System.out.println("perimeter  = " + perimeter);
	 System.out.println("Area = " + theArea);
	 
	 String msg = "Side a, b, c =" + sideA+","
			 + sideB + "," + sideC + ("\n") + "; perimeter: " + perimeter + ("\n")
			 + ", Area: "+ theArea + "\n" + "the angles =" + theAngles;
	 
	 JOptionPane.showMessageDialog(null, msg);
	 
	}
	//end of the show vars
	
	
	public void setSides() {		
		sideA = Double.parseDouble(JOptionPane.showInputDialog("enter side a: " ));

		sideB = Double.parseDouble(JOptionPane.showInputDialog("enter side b: " ));
		
		sideC = Double.parseDouble(JOptionPane.showInputDialog("enter side c: " ));}
	// end of set sides
	
	public void CalcPerimeter() {
		perimeter = sideA + sideB + sideC;
		
	}
	//end of calcperimeter
	
	public void CalcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC)/2.0;
		
		theArea = Math.sqrt(p *(p - sideB) * (p - sideB) * (p - sideC));
		System.out.println("area = " + theArea + ("\n"));
	}
	
	public void CalcAngles() {
		double cosA = 0.0, Acos = 0.0, Adeg = 0.0, cosB = 0.0, Bcos = 0.0, Bdeg = 0.0, cosC = 0.0, Ccos = 0.0, Cdeg = 0.0;
		
		cosA = (Math.pow(sideB, 2.0)+ Math.pow(sideC, 2.0)- Math.pow(sideA, 2.0))/
				(2.0 * sideB * sideC);
		//System.out.println("cosA = " + cosA);
		Acos = Math.acos(cosA);
		//System.out.println("Acos =" + Acos);
		Adeg = Math.toDegrees(Acos);
		//System.out.println("angle a =" + Adeg); 
		
		cosB = (Math.pow(sideC, 2.0)+ Math.pow(sideA, 2.0)- Math.pow(sideB, 2.0))/
				(2.0 * sideC * sideA);
		
		Bcos = Math.acos(cosB);
		
		Bdeg = Math.toDegrees(Bcos);
		//System.out.println("angle b =" + Bdeg);
		
		cosC = (Math.pow(sideA, 2.0)+ Math.pow(sideB, 2.0)- Math.pow(sideC, 2.0))/
				(2.0 * sideA * sideB);
		
		Ccos = Math.acos(cosC);
		Cdeg = Math.toDegrees(Ccos);
		//System.out.println("angle C =" + Cdeg);
		theAngles = (Adeg)+ "," + (Bdeg) + "," + (Cdeg);

	}
	
}
