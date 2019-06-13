package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{
  /* 
	 * Create a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	JFrame jf;
	JPanel jp;
	JButton addEntry, searchByID, viewList, removeEntry;
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	void setup()
	{
		jf = new JFrame();
		jp = new JPanel();
		addEntry = new JButton("Add Entry");
		searchByID = new JButton("Search By ID");
		viewList = new JButton("View List");
		removeEntry = new JButton("Remove Entry");
		jf.add(jp);
		jp.add(addEntry);
		jp.add(searchByID);
		jp.add(viewList);
		jp.add(removeEntry);
		addEntry.addActionListener(this);
		searchByID.addActionListener(this);
		viewList.addActionListener(this);
		removeEntry.addActionListener(this);
		jf.pack();
	}
	void show() { jf.setVisible(true); }
	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.setup();
		ls.show();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource() == addEntry)
		{
			log.put(Integer.parseInt(JOptionPane.showInputDialog("Put the ID of the Person:")), JOptionPane.showInputDialog("Put the full name of the person:"));
		}
		else if (ae.getSource() == searchByID)
		{
			int key = Integer.parseInt(JOptionPane.showInputDialog("Search for ID #:"));
			if (log.containsKey(key))
			{
				JOptionPane.showMessageDialog(null, log.get(key));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "There is no person with that ID");
			}
		}
		else if (ae.getSource() == viewList)
		{
			//ID: 123  Name: Harry Howard
			StringBuilder sb = new StringBuilder();
			for (int i : log.keySet())
			{
				sb.append("ID: " + i + "  Name: " + log.get(i));
				sb.append("\n");
			}
			JOptionPane.showMessageDialog(null, sb);
		}
		else if (ae.getSource() == removeEntry)
		{
			int key = Integer.parseInt(JOptionPane.showInputDialog("ID of entry you want to remove:"));
			if (log.containsKey(key))
			{
				log.remove(key);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "No such entry exists");
			}
		}
	}
	
}
