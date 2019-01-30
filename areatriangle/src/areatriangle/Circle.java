package areatriangle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Circle {
	
	private double getradius;
	private double getcircumfrence;
	private double getarea;
	
	Scanner keyboard = new Scanner(System.in);
	
	public void setVarsToZero() {
		
		getradius = 0.0;
		getcircumfrence = 0.0;
		getarea = 0.0;
		
	}	
	
	public void setcircle() {
		
		getradius = Double.parseDouble(JOptionPane.showInputDialog("enter radius: " ));
		
	}
	
	public void setperimeter() {
		
		getcircumfrence = 2 * 3.14 * getradius;
		
	}
	
	public void setarea() {
		
		getarea = 3.14 * getradius * getradius;
		
	}
	public void ShowVars() {
		
		 String msg = "circumfrence =" + getcircumfrence + "\n" + "the area =" + getarea;
		 
		 JOptionPane.showMessageDialog(null, msg);	
	
	}
}
