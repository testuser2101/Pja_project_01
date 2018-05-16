import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class addpanel extends JFrame{
	JPanel maincontener = new JPanel();
	JPanel bottomcontener = new JPanel();
	JPanel gridcontener = new JPanel();
	JLabel title = new JLabel ("Title");
	JLabel director = new JLabel ("Director");
	JLabel date = new JLabel ("Publication date");
	JLabel genre = new JLabel ("Genre");
	JLabel length = new JLabel ("Length");
	JTextField titletext = new JTextField ("x");
	JTextField directortext = new JTextField ("x");
	JTextField datetext = new JTextField ("x");
	JTextField genretext = new JTextField ("x");
	JTextField lengthtext = new JTextField ("x");
	JButton add = new JButton ("Add a movie");
	addpanel(){
		super("Add a movie");
		maincontener.setLayout(new BorderLayout());
		maincontener.add(gridcontener, BorderLayout.CENTER);
		bottomcontener.add(add);
		
		maincontener.add(bottomcontener, BorderLayout.PAGE_END);
		
		gridcontener.setLayout(new GridLayout(5,2,5,0));
		
		gridcontener.add(title);
		gridcontener.add(titletext);
		gridcontener.add(genre);
		gridcontener.add(genretext);
		gridcontener.add(director);
		gridcontener.add(directortext);
		gridcontener.add(date);
		gridcontener.add(datetext);
		gridcontener.add(length);
		gridcontener.add(lengthtext);




		
		
		
		gridcontener.add(lengthtext);
		this.add(maincontener);
		
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(400,200);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	void addpToC(ActionListener e) {
		add.addActionListener(e);		
	}
}
