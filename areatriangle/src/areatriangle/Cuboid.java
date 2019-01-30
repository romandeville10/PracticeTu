package areatriangle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cuboid {
	
	private double getheight;
	private double getlength;
	private double getdepth;
	private double getvolume;
	private double getarea;
	
	Scanner keyboard = new Scanner(System.in);
	
	public void setVarsToZero() {
		
		getheight = 0.0;
		getlength = 0.0;
		getdepth = 0.0;
		getvolume = 0.0;
		getarea = 0.0;
	}
	
	public void setheight() {
		
		getheight = Double.parseDouble(JOptionPane.showInputDialog("enter height: " ));
		
	}
	
	public void setlength() {
		
		getlength = Double.parseDouble(JOptionPane.showInputDialog("enter length: " ));
		
	}
	
	public void setdepth() {
		
		getdepth = Double.parseDouble(JOptionPane.showInputDialog("enter depth: " ));
		
	}
	public void setvolume() {
		
		getvolume = getlength * getheight * getdepth;
		
	}
	
	public void setarea() {
		
		getarea = 2*(getlength * getheight + getdepth * getheight + getdepth * getlength);
		
	}
	public void ShowVars() {
		
		 String msg = "volume =" + getvolume + "\n" + "the area =" + getarea;
		 
		 JOptionPane.showMessageDialog(null, msg);	
	
	}
	
}