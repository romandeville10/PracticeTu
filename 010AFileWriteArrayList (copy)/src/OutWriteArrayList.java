import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OutWriteArrayList {

	public static void main(String[] args) {
		File fileName = new File("MyFriends.txt");
		ArrayList aList = new ArrayList();
		String friend = " ";
		
		while (!friend.isEmpty()) {
			friend = JOptionPane.showInputDialog("Name a friend, please.");
			if (!friend.isEmpty() ) aList.add(friend);
		}

	}

}
