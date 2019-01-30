package areatriangle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Rectangle {
	
	private double getheight;
	private double getlength;
	private double getperimeter;
	private double getarea;
	
	Scanner keyboard = new Scanner(System.in);
	
	public void setVarsToZero() {
		
		getheight = 0.0;
		getlength = 0.0;
		getperimeter = 0.0;
		getarea = 0.0;
	}
	
	public void setheight() {
		
		getheight = Double.parseDouble(JOptionPane.showInputDialog("enter height: " ));
		
	}
	
	public void setlength() {
		
		getlength = Double.parseDouble(JOptionPane.showInputDialog("enter length: " ));
		
	}
	public void setperimeter() {
		
		getperimeter = getlength + getlength + getheight + getheight;
		
	}
	
	public void setarea() {
		
		getarea = getlength * getheight ;
		
	}
	public void ShowVars() {
		
		 String msg = "perimeter =" + getperimeter + "\n" + "the area =" + getarea;
		 
		 JOptionPane.showMessageDialog(null, msg);	
	
	}
	
}