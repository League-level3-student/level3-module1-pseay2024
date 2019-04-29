package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		new _02_GuestBook().createGUI();
		// creating create
	}

	public void createGUI() {
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		addName.setText("Add");
		viewNames.setText("View");
		jp.add(addName);
		jp.add(viewNames);
		jf.add(jp);
		jf.setVisible(true);
		jf.pack();
	}
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addName) {
			names.add(JOptionPane.showInputDialog(null, "Enter a name"));
		} else if (e.getSource() == viewNames) {
			String print = "";
			for (int i = 0; i < names.size(); i++) {
				print += "Guest #" + (i + 1) + ": " + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, print);
		}
	}
}