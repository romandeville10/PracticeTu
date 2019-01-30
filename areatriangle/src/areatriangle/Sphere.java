package areatriangle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sphere {
	
	private double getradius;
	private double getarea;
	private double getvolume;
	
	Scanner keyboard = new Scanner(System.in);
	
	public void setVarsToZero() {
		
		getradius = 0.0;
		getarea = 0.0;
		getvolume = 0.0;
		
	}	
	
	public void setSphere() {
		
		getradius = Double.parseDouble(JOptionPane.showInputDialog("enter radius: " ));
		
	}
	
	public void setVolume() {
		
		getvolume = 1.333 * Math.PI *(getradius * getradius * getradius);
		
	}
	
	public void setarea() {
		
		getarea = 4 * 3.14 *(getradius * getradius);
		
	}
	public void ShowVars() {
		
		 String msg = "the area =" + getarea + "\n" + " volume =" + getvolume;
		 
		 JOptionPane.showMessageDialog(null, msg);	
	
	}
}