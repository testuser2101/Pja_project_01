import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class View extends JFrame {
	
	Dimension size = new Dimension(850,650);
	JTextField text = new JTextField();
	Font font;
	Font font2;
	File filefont;
	
	
	String[] list = { "Title", "Genre", "Director", "Publication Date", "Length" };
	Object[][] data = {	
			{"title1", "genre1",
			     "director1", "Publication Date1", "length1"},
			    
	};
	
	
	JPanel mainPanel = new JPanel();
	JPanel navPan = new JPanel();
	
	JButton LoadFile = new JButton("Load CSV File");
	JButton add = new JButton("Add");
	JButton delete = new JButton("Delete");
	JComboBox sortList = new JComboBox(list);
	JButton sortup = new JButton ("⇅");
	
	JLabel search = new JLabel("Search");
	JTextField searchfield = new JTextField();
	JLabel searchby = new JLabel ("Search by");
	JPanel bottompan = new JPanel();
	JTable table = new JTable(data, list);
	JScrollPane scroll = new JScrollPane(table);
	JFileChooser chooseFile = new JFileChooser();
	FileNameExtensionFilter csvfilter = new FileNameExtensionFilter("CSV File", "csv");
	
	View(){	
		super("Pja_Project01");
		filefont = new File("src\\ComicSans.ttf");
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, filefont);
		} catch (FontFormatException | IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}			
		font = font.deriveFont(1, 15);
		text.setText("gowno");
		text.setFont(font);
	//	System.out.println(text.getFont());
		searchfield.setPreferredSize(new Dimension(200,25));
		navPan.setBackground(Color.white);
		navPan.add(LoadFile);
		navPan.add(add);
		navPan.add(delete);
		navPan.add(search);
		navPan.add(searchfield);
		navPan.add(searchby);
		navPan.add(sortList);
		navPan.add(sortup);	
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		table.setFont(font);
		table.setRowHeight(25);
		mainPanel.setFont(font);
		mainPanel.setBackground(Color.cyan);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(navPan, BorderLayout.PAGE_START);
		mainPanel.add(scroll, BorderLayout.CENTER);
	//	bottompan.setLayout(new BorderLayout());
	//	table.setFillsViewportHeight(true);
	//	scroll.setSize(new Dimension(this.getHeight()-navPan.getHeight(),this.getWidth()-navPan.getWidth()));					
		System.out.println(sortList.getSelectedIndex());
		

		chooseFile.setAcceptAllFileFilterUsed(false);
		chooseFile.setFileFilter(csvfilter);
		//chooseFile.setCurrentDirectory(new File(System.getProperty("user.home")));

		
		this.setMinimumSize(size);
		this.add(mainPanel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(size);
		this.setVisible(true);
	}	        
	
	void loadToC(ActionListener e) {
		LoadFile.addActionListener(e);	
	}
	
	void addToC(ActionListener f) {
		add.addActionListener(f);
	}
	void deleteToC(ActionListener g) {
		delete.addActionListener(g);
	}
	void sortupToC(ActionListener h) {
		sortup.addActionListener(h);
	}
	void sortByToC(ActionListener i) {
		sortList.addActionListener(i);
	}

	void FileChooser() {
		
	
		
	}

	public void FileChooser(File csvfile) {
		chooseFile.accept(csvfile);
		chooseFile.showOpenDialog(this);

		csvfile = chooseFile.getSelectedFile();
		try {
		System.out.println(csvfile.length());
		}
		catch (Exception e) {
			System.out.println(e);
		}

		try {
			
			FileOutputStream out = new FileOutputStream(csvfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		}
	
	
}