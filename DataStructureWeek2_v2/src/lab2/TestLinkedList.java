package lab2;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListReferenceBased alist = new ListReferenceBased();
		
		//Testing isEmpty
		System.out.println("Is the list empty?: " + alist.isEmpty());
		System.out.println("----------------------");
		System.out.println("What is the size of the array?: " + alist.size());
		System.out.println("----------------------");
		//Testing Add
		alist.add(1, "Milk");
		alist.add(2, "Watermelon");
		alist.add(3, "Eggs");
		alist.add(4, "Hams");
		alist.add(5, "Cheese");
		System.out.println("What is the size of the array?: " + alist.size());
		System.out.println("----------------------");
		//Testing Remove
		alist.remove(5);
		System.out.println("What is the size of the array?: " + alist.size());
		System.out.println("----------------------");
		alist.displayList();
		
		
		
		
		
		
		//Testing the commit
		//System.out.println("Testing commit");
		
		/*
		 * My own note
		 * Step to link git with the IDE
		 * 1. Right click on project and go down to team then press share project
		 * 2. Create it in a folder then go to the folder where i put it
		 * 3. 
		 */
		// Go into the Window (At the top left) -> show view and open up Terminal
		// Type in git log > git_history.txt
		// Upload git history file
	}

}
