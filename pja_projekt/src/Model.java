import java.io.File;


public class Model {
	boolean sortup=true;
	File csvfile;
	public String[][] Data;
	public void load() {
		System.out.println("testload");
	}
	
	public void sort() {
		
	}
	
	public void addNewMovie() {
		System.out.println("testaddnewmovie");
	
	}
	
	public void delete() {
		System.out.println("DELETtest");
		
	}
	
	public void addMovie() {

	}
	
	public void sortup() {
		if (sortup){
			sortup=false;
			System.out.println("Sortujê w do³");
			
		}
		else {
			sortup=true;
			System.out.println("Sortuje w gore");
		}
	}
	
	public void searchby(String sortby) {
		System.out.println("sortuje po: " +sortby);
	}
}
