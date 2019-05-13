package _01_IntroToArrayLists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SantaList implements MouseListener{
	JPanel jp;
	JFrame jf;
	
private JLabel loadImageFromTheInternet(String imageUrl) {
		try 
		{
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
private JLabel loadImageFromJavaProject(String fileName)
{ 
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	public static void main(String[] args) {
		SantaList sl = new SantaList();
		sl.setup();
	}
	void setup()
	{
		ArrayList<JLabel> list = new ArrayList<JLabel>();
		
		jf = new JFrame();
		jp = new JPanel();
		jp.addMouseListener(this);
		jf.setSize(100, 100);
		jf.add(jp);
		jf.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		jp.add(loadImageFromTheInternet("https://www.liberaldictionary.com/wp-content/uploads/2018/12/present.png"));
		jf.pack();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
