import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
public class Control{
	private View projectView;
	private Model projectModel;
	String listSelected;
	addpanel newmovie;
	//_______________________________________________
		//Control Constructor
	
	
	public Control(View projectView, Model projectModel) {
	
		this.projectView=projectView;
		this.projectModel=projectModel;
		this.projectView.loadToC(new loadbutton());
		this.projectView.addToC(new addbutton());
		this.projectView.deleteToC(new deletbut());
		this.projectView.sortupToC(new sortUpBut());
		this.projectView.sortByToC(new sortbyList());
	}
	
	//_______________________________________________
		//loading from file
	class loadbutton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			projectView.FileChooser(projectModel.csvfile);
			
		}
	}
	
	//_______________________________________________
		//opening adding panel button
	
	
	class addbutton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			addpanel newmovie = new addpanel();
			newmovie.addpToC(new addpanelbut(newmovie));
		
			
			
		}
	}
	
	
	
	//_______________________________________________
		//Deleting button
	
	
	
	
	class deletbut implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			projectModel.delete();
			
		}
		//_______________________________________________
		//Sorting up-down button
	}
	class sortUpBut implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			projectModel.sortup();
		}
		
		//_______________________________________________
		//Sorting by combo box 
	}
	class sortbyList implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			  JComboBox cb = (JComboBox)e.getSource();
		        String petName = (String)cb.getSelectedItem();
			listSelected = petName;
			projectModel.searchby(petName);
		}
		
	}
	
	
	
	//_______________________________________________
	//adding panel listener
	
	
	
	class addpanelbut implements ActionListener{
	addpanel newmovie;
		addpanelbut(addpanel newmovie){
			this.newmovie=newmovie;
		}

				public void actionPerformed(ActionEvent e) {
				projectModel.addNewMovie();
				newmovie.dispose();
				
				
				}

	}
	
	
	
	
}







