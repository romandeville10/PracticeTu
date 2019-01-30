package areatriangle;

import javax.swing.JOptionPane;

public class runner {
	
	public static void main(String [] args) {
		
	JOptionPane.showMessageDialog(null, "hello java world");
	
	//instantiancly//	
	Triangle myTriangle = new Triangle();
	
	Circle myCircle = new Circle();
	
	Rectangle myRectangle = new Rectangle();
	
	Cuboid myCuboid = new Cuboid();
	
	Sphere mySphere = new Sphere();
	
	int goAgain = 1;
	
	while (goAgain == 1) {
	
	String msg = "Please enter: Triangle, Circle, Rectangle, Cuboid, sphere";
	//JOptionPane.showMessageDialog(null, msg);

	String answer = JOptionPane.showInputDialog(msg);
	
	if ((answer.equals("Triangle")) || (answer.equals("triangle"))) {
		JOptionPane.showMessageDialog(null, "Triangle");
		
		myTriangle.setVarsToZero();
		myTriangle.setSides();
		myTriangle.CalcPerimeter();
		myTriangle.CalcArea();
		myTriangle.CalcAngles();
		myTriangle.ShowVars();
		
	}
	
	else if ((answer.equals("Circle")) || (answer.equals("circle"))){
		JOptionPane.showMessageDialog(null, "Circle");
		
		myCircle.setVarsToZero();
		myCircle.setcircle();
		myCircle.setperimeter();
		myCircle.setarea();
		myCircle.ShowVars();
		
		
	}
	else if ((answer.equals("Rectangle")) || (answer.equals("rectangle"))) {
		JOptionPane.showMessageDialog(null, "Rectangle");
		
		myRectangle.setVarsToZero();
		myRectangle.setheight();
		myRectangle.setlength();
		myRectangle.setperimeter();
		myRectangle.setarea();
		myRectangle.ShowVars();
		
	}
	else if(answer.equals("cuboid")) {
		JOptionPane.showMessageDialog(null, "Cuboid");
		
		myCuboid.setVarsToZero();
		myCuboid.setheight();
		myCuboid.setlength();
		myCuboid.setdepth();
		myCuboid.setvolume();
		myCuboid.setarea();
		myCuboid.ShowVars();
		
	}
	else if(answer.equals("sphere")) {
		JOptionPane.showMessageDialog(null, "sphere");
		
		mySphere.setVarsToZero();
		mySphere.setSphere();
		mySphere.setVolume();
		mySphere.setarea();
		mySphere.ShowVars();
	}
	else {
		JOptionPane.showMessageDialog(null, "error");
		
	}
	
	msg = "would you like to go agian?";
	answer = JOptionPane.showInputDialog(msg);
	
	//JOptionPane.showMessageDialog(null, answer);
	
	if (answer.equals("y") || answer.equals("Y")
			|| answer.equals("yes")
			|| answer.equals("Yes")){
			goAgain = 1;
	}
	else {
		goAgain = 0;
		JOptionPane.showMessageDialog(null, "Thank you come again");
	}

	}//end of main
	}//end of all
	
}//end of runner
